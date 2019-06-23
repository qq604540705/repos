package DruidDemo;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //先获取配置文件
        Properties properties=new Properties();
        //获取流对象,用class里面的方法获取src文件夹下的文件
        InputStream is = Demo1.class.getClassLoader().getResourceAsStream("druid.properties");
        //加载配置文件
        properties.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        for (int i = 0; i < 5; i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn);
        }
    }
}
