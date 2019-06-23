package com.itheima.dao.impl;

import com.itheima.bean.User;
import com.itheima.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    private UserService userService ;

    @Before
    public void init(){
        //1. 读取配置文件,创建容器对象
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        //2. 获取userService对象,完成初始化
        userService = (UserService) applicationContext.getBean("userService");
    }

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