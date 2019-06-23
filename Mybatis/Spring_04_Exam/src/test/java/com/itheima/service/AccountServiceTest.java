package com.itheima.service;

import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 */
public class AccountServiceTest {

    private AccountService accountService = new AccountServiceImpl() ;

    @Test
    public void transfer() {
        accountService.transfer("zhangsan","lisi",100d);
    }
}