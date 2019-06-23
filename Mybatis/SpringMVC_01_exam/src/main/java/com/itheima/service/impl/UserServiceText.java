package com.itheima.service.impl;


import com.itheima.bean.User;
import com.itheima.service.UserService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springmvc.xml")
public class UserServiceText {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void findAll(){
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println("user = " + user);
        }
    }

}
