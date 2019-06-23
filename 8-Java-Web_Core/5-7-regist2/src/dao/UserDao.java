package dao;

import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

/*
* 提供数据查询后的一个封装到User的对象
* 1.调用工具类的方法获取到connection对象
* 2.用CONN去在数据库中匹配,并将结果封装成一个User对象,然后将这个对象返回
* */
public class UserDao {
    //拿到一个连接对象
    private static JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    public  static User login(User user){
        try {
            String sql="SELECT * FROM user where username=? and password=?;";
            //通过连接对象去查询数据
            User user1 = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), user.getUsername(), user.getPassword());
            //将查询的到的结果封装成一股User类
            return user1;
        } catch (Exception e) {
           return null;
        }
    }
}
