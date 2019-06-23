package com.itheima.service;

import com.itheima.Config.SpringConfig;
import com.itheima.service.impl.AccountServiceImpl;
import com.itheima.utils.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void saveAccount() {
        accountService.saveAccount();
    }

    @Test
    public void updateAccount() {
        accountService.updateAccount(1);
    }

    @Test
    public void delAccount() {
        accountService.delAccount();
    }
}
