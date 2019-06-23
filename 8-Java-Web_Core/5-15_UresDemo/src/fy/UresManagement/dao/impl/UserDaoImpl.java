package fy.UresManagement.dao.impl;

import fy.UresManagement.dao.UserDao;
import fy.UresManagement.domain.User;
import fy.UresManagement.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.Year;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        String sql="select * from user";
        List<User> query = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

    @Override
    public User findUsernameAndPassword(String username, String password) {

        try {
            String sql="select * from user where username=? and password=?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public void addUser(User user) {
        String name = user.getName();
        String gender = user.getGender();
        int age = user.getAge();
        String address = user.getAddress();
        int qq = user.getQq();
        String email = user.getEmail();
        String sql="INSERT into user VALUES(null,?,?,?,?,?,?,null,null)";
        int update = template.update(sql, name, gender, age, address, qq, email);
    }

    @Override
    public void deleteUser(int id) {
        String sql="DELETE FROM user WHERE id=?;";
        template.update(sql, id);
    }
}
