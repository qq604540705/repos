package com.itheima.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 *
 * jdbc工具类,主要提供二个方法
 * 1. 获取连接
 * 2. 获取连接池
 */
public class JdbcUtils {

    private static DruidDataSource dataSource  ;

    static {
        try {
            //读取配置文件
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            //加载数据到Properties对象中
            Properties properties = new Properties();
            properties.load(is);

            //创建连接池对象
            dataSource = new DruidDataSource();
            dataSource.setDriverClassName(properties.getProperty("driverClassName"));
            dataSource.setUrl(properties.getProperty("url"));
            dataSource.setUsername(properties.getProperty("username"));
            dataSource.setPassword(properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 获取连接池
     * @return
     */
    public static DataSource getDataSource(){
        return dataSource ;
    }
}
