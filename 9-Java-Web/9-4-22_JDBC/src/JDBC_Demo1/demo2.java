package JDBC_Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 1.导入jar包
//2.连接数据库
//3.创建数据库实现对象
//4.实现对象创建语句实现对象
//5.返回语句执行结果
//6.关闭资源
public class demo2 {
    public static void main(String[] args)  {
        Connection conn =null;
        Statement statement =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.23.41:3306/db5", "root", "root");
            statement = conn.createStatement();
            for (int i = 0; i < 10; i++) {
                int a = statement.executeUpdate("insert into account values(null,'鸡儿真美','999999')");
                System.out.println(a>0?"修改成功":"修改失败");
            }
           /* int i = statement.executeUpdate("insert into account values(null,'鸡儿真美','999999')");
            System.out.println(i>0?"修改成功":"修改失败");*/
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
