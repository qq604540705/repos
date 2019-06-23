package com.itheima.service;

import com.itheima.bean.User;
import com.itheima.dao.impl.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService ;

    @Test
    public void add() throws SQLException {
        //创建用户对象
        User user = new User();
        user.setUsername("赵敏");
        user.setAddress("金融港");
        user.setSex("男");
        user.setBirthday(new Date());

        userService.add(user);
    }

    @Test
    public void update() throws SQLException {
        //创建用户对象
        User user = new User();
        user.setId(45);
        user.setUsername("张无忌");
        user.setAddress("金融港");
        user.setSex("男");
        user.setBirthday(new Date());

        userService.update(user);
    }

    @Test
    public void delete() throws SQLException {
        userService.delete(48);
    }

    @Test
    public void findById() throws SQLException {
        User user = userService.findById(45);
        System.out.println(user);
    }

    @Test
    public void findAll() throws SQLException {
        List<User> users = userService.findAll();
        System.out.println(users);
    }
}