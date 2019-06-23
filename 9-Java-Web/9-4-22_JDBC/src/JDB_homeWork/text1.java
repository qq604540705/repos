package JDB_homeWork;

import Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

//账号登入 正常登入需要打印数据库全部信息,需要取出的数 存到集合里,然后在遍历集合
public class text1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String s = sc.nextLine();
        System.out.println("请输入密码");
        String s1 = sc.nextLine();
        boolean login = login(s, s1);
        if (login){
            System.out.println("登录成功");
            query();
        }else {
            System.out.println("账号或密码错误");
        }
    }
    //登录成功后的查询方法
    public static void query(){
        ArrayList<Emp> list=new ArrayList<>();
        try {
            Connection conn = JDBCUtils.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String ename = rs.getString(2);
                int job_id = rs.getInt(3);
                int mgr = rs.getInt(4);
                String joindate = rs.getString(5);
                double salary = rs.getDouble(6);
                double bonus = rs.getDouble(7);
                int dept_id = rs.getInt(8);
                Emp emp = new Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);
                list.add(emp);
            }
            //打印输出
            for (Emp emp : list) {
                System.out.println(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //账号登入方法
    public static boolean login(String user, String password) {
        Connection conn = null;
        PreparedStatement psttmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            psttmt = conn.prepareStatement("SELECT * from user WHERE name=? and password=?");
            psttmt.setString(1, user);
            psttmt.setString(2, password);
            rs = psttmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, psttmt, rs);
        }
        return false;
    }
}
