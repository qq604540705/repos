package com.itheima.dao;

import com.itheima.dao.impl.UserDaoImpl;

public class UserDaoStaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
