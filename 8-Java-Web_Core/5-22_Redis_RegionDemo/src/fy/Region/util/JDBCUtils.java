package fy.Region.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/** JDBC的工具类
 *  加载Druid配置文件
 *  创建连接池对象
 *      提供一个获取连接池的方法
 */
public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            Properties pop=new Properties();
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pop.load(is);
            ds = DruidDataSourceFactory.createDataSource(pop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取连接池对象
    public static DataSource getDataSource(){
        return ds;
    }
    //获取连接对象
    public static Connection getConnection() throws SQLException {
        Connection conn = ds.getConnection();
        return conn;
    }

}
