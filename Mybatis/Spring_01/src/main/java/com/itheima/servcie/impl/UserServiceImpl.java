package com.itheima.servcie.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.servcie.UserService;

public class UserServiceImpl implements UserService {

    private  UserDao userDao =  new UserDaoImpl();

    @Override
    public void add(){
        System.out.println("业务层添加方法执行....");
        userDao.add();
    }
}
