package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
 * JDBC工具栏
 * */
public class JDBCUtils {
    private static DataSource ds;
    static {
        //创建一个集合类,用来读取配置文件
        Properties properties = new Properties();
        //用类加载器去读取SRC下面的配置文件
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(is);
           //初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取连接池对象
    public static DataSource getDataSource(){
        return ds;
    }
    //获取数据库链接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
