package com.itheima.service;

import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 */
@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试的核心运行类
@ContextConfiguration(locations = "classpath:beans.xml") //指定spring配置文件的路径
public class AccountServiceTest {

    @Autowired
    private AccountService accountService  ;

    @Test
    public void transfer() {
        accountService.transfer("zhangsan","lisi",100d);
    }
}