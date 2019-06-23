package com.itheima.dao;

import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 */
public class AccountDaoTest {

    private AccountDao accountDao = new AccountDaoImpl();

    @Test
    public void findAll() {
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void findByUsername() {
        Account account = accountDao.findByUsername("zhangsan");
        System.out.println(account);
    }

    @Test
    public void findTotalcount() {
        Integer totalcount = accountDao.findTotalcount();
        System.out.println(totalcount);
    }

    @Test
    public void add() {
        Account account = new Account();
        account.setUsername("wangwu");
        account.setMoney(10000d);
        accountDao.add(account);
    }

    @Test
    public void update() {
        Account account = new Account();
        account.setId(3);
        account.setUsername("wangwu");
        account.setMoney(5000d);

        accountDao.update(account);
    }

    @Test
    public void deleteById() {
        accountDao.deleteById(3);
    }
}