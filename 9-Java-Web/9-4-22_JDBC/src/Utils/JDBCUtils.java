package Utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

//定义一个工具类
//类里面定义
// 1.导入jar包
//2.连接数据库
//6.关闭资源
//需要配置文件,配置文件里面有4个属性,可以自定义
public class JDBCUtils {
    //将对象创建成静态的,都能调用
    private static String driverClassname;
    private static String url;
    private static String user;
    private static String password;
    //读取配置文件,获得配置文件里面的属性
    //封装到一个静态方法里面,让这个方法能最先执行
    static {
        Properties properties = new Properties();
        //用load方法 读取配置文件
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(is);
            driverClassname = properties.getProperty("driverClassname");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            //注册驱动只需要一次,不用每次都调用
            // 1.导入jar包
            Class.forName(driverClassname);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    //2.连接数据库
    public static Connection getConnection() throws Exception {
       return DriverManager.getConnection(url, user, password);
    }

    //6.关闭资源
    public static void close(Connection conn,Statement statement){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn,Statement statement,ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
