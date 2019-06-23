package com.itheima.service;

import com.itheima.bean.User;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserServiceTest {

    private UserService userService;

    @Test
    public void findAll() throws SQLException {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = ca.getBean("UserService", UserService.class);
        List<User> users = userService.findAll();
        System.out.println(users);
    }
}