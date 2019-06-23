package com.itheima.servcie;

import com.itheima.servcie.impl.UserServiceImpl;

public class UserServiceFactory {

    public UserService getBean(){
        return new UserServiceImpl();
    }
}
