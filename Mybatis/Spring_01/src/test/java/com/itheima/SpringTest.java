package com.itheima;

import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.servcie.UserService;
import com.itheima.servcie.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
        //1. 获取spring容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");

        /*//2. 从容器中获取对象
        UserDaoImpl userDao = ac.getBean("UserDao", UserDaoImpl.class);
        userDao.add();
        UserServiceImpl userService = ac.getBean("UserService", UserServiceImpl.class);
        userService.add();*/
        UserService userServiceFactory = ac.getBean("UserService",UserService.class);
        userServiceFactory.add();
        UserDaoImpl userDao = ac.getBean("UserDao", UserDaoImpl.class);
        userDao.add();
    }
}
