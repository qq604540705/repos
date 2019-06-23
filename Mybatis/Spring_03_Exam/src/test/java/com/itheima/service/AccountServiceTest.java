package com.itheima.service;

import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;

import java.sql.SQLException;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */

public class AccountServiceTest {

    @Test
    public void transfer() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("zhangsan", "lisi", 100d);
    }
}