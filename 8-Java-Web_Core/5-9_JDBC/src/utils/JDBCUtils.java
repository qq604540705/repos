package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    public static DataSource ds;
    static {
        //获取到一个集合对象
        Properties properties=new Properties();
        //获取到src目录下的配置文件的资源路径
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            //将配置中的内容读取到集合中
            properties.load(is);
            //初始化连接池对象
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //因为使用连接池的时候,需要传入一个连接池对象,所以提供一个能获取到连接池的方法
    public DataSource getDataSource(){
        return ds;
    }
    //通过连接池对象,取到一个实际的数据库连接对象Connection
    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
