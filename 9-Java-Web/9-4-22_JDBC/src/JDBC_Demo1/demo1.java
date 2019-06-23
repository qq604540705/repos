package JDBC_Demo1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

//练习用java给数据库添加数据
public class demo1 {
    //1.连接导数据库jar包
    //2.连接数据库
    //3.通过连接对象获取语句对象
    //4.通过语句对象执行sql语句
    //5.返回执行的结果
    //6.关闭资源
    public static void main(String[] args) throws Exception {
        //1.连接导数据库jar包
        Class.forName("com.mysql.jdbc.Driver");
        //2.通过DriverManager连接数据库
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day4", "root", "root");
        //3.通过连接对象获取语句对象
        Statement statement = conn.createStatement();
        //4.通过语句对象执行sql语句
        int i = statement.executeUpdate("update account set balance=2000");
        //5.返回执行的结果
        System.out.println(i>0?"修改成功":"修改失败");
        //6.释放资源
        statement.close();
        conn.close();
    }
}
