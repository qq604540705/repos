package dao;

import domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class UserDao2 {
    public  static JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    public static boolean setUser(String user,String password){
        if(user!=null&password!=null){
            String sql="insert into user values(null,?,?)";
            int update = template.update(sql, user, password);
            if (update==1){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
