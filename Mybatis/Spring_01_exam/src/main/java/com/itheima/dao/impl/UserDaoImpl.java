package com.itheima.dao.impl;

import com.itheima.bean.User;
import com.itheima.dao.UserDao;
import com.itheima.utils.JdbcUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll(){
        String sql = "select * from user ";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }
}
