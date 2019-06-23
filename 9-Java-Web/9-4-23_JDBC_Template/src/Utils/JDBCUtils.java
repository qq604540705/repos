package Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/*
    工具类作用:1.获取连接池 2.获取连接对象 3.归还连接对象
*/
public class JDBCUtils {
    public static DataSource ds;
    static {
        try {
            Properties properties = new Properties();
            //用load方法 读取配置文件
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(is);
        //创造Druid连接池对象
        ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    //2.获取连接池的方法
    public static DataSource getDataSource(){
        return ds;
    }
    //3.提供一个获取连接对象的方法
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //4.关闭资源(归还连接对象到连接池)
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
