package com.itheima.service;

import com.itheima.service.impl.AccountServiceImpl;
import com.itheima.utils.TransactionManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class AccountServiceTest {

    @Autowired
    private TransactionManager transactionManager;

    @Autowired
    private  AccountService accountService;

    @Test
    public void transfer() throws SQLException {
        accountService.transfer("zhangsan", "lisi", 100d);
    }
}