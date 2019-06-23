package com.itheima.service.impl;

import com.itheima.bean.User;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add(User user) throws SQLException {
        userDao.add(user);
    }

    @Override
    public void update(User user) throws SQLException {
        userDao.update(user);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        userDao.delete(id);
    }

    @Override
    public User findById(Integer id) throws SQLException {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() throws SQLException {
        return userDao.findAll();
    }
}
