package JDBC_Demo1;

import java.sql.*;

public class DmlDemo1 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement statement =null;
        ResultSet rs =null;
        try {
            //调用JDBCU工具类直接调用方法,获取步骤1和2
            conn = JDBCUtils2.getConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery("SELECT * from account;");
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int balance = rs.getInt("balance");
                System.out.println(id+" "+name+" "+balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            JDBCUtils2.close(conn,statement,rs);
        }
    }
}
