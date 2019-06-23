package com.itheima.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
public class JdbcUtils {

    //将连接保存在线程之中
    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>() ;

    private  static  DataSource dataSource ;

    static {
        try {
            //1. 加载属性配置文件进内存
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            //2. 创建Properties对象
            Properties properties = new Properties();
            //3. 加载数据
            properties.load(inputStream);
            //4. 创建连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接池对象
     * @return
     */
    public  DataSource getDataSource(){
        return dataSource ;
    }

    /**
     * 获取连接,保证一个业务所使用的的连接是同一个
     * @return
     * @throws SQLException
     */
    public  Connection getConnection() throws SQLException {
        //1. 从线程之中获取连接
        Connection connection = tl.get();
        //2. 如果没有获取到连接,从连接池中获取,获取完了之后保存在线程之后
        if(connection==null){
            connection = dataSource.getConnection();
            //将连接保存在线程之中
            tl.set(connection);
        }
        //3. 如果获取到了,直接返回使用
        //Connection connection = dataSource.getConnection();
        return connection;
    }

    /**
     * 清理线程之中的连接
     */
    public void release(){
        tl.remove();//删除线程之中保存的数据
    }

}
