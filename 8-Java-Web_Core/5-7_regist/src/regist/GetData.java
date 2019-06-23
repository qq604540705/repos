package regist;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*
    1.链接数据库
    2.将web服务器端接受的数据用来和数据库中数据匹配
    3.将匹配结果返回
*/
public class GetData {
    public  boolean getBasesData(String username ,String password) throws Exception {
//            1.链接数据库
        Properties properties = new Properties();
        InputStream is = GetData.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        Connection conn = ds.getConnection();
//        2.将web服务器端接受的数据用来和数据库中数据匹配
        String sql="select * from user WHERE username=? and password=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet rs = preparedStatement.executeQuery();
        return rs.next();
    }
}
