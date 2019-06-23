package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.utils.JdbcUtils;
import com.itheima.utils.TransactionManager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * @param sourceUsername 转出账户用户名
     * @param targetUsername 转入账户用户名
     * @param money          转账金额
     * @throws SQLException
     */
    @Override
    public void transfer(String sourceUsername, String targetUsername, Double money) {
        try {
            //1. 根据转出账户用户名查询转出账户信息
            Account source = accountDao.findByUsername(sourceUsername);  // 从连接池中获取连接  connection2
            //2. 根据转入账户用户名查询转入账户信息
            Account target = accountDao.findByUsername(targetUsername);  // 从连接池中获取连接  connection3
            //3. 给转出账户扣钱
            source.setMoney(source.getMoney() - money); //1000 - 100
            //4. 给转入账户加钱
            target.setMoney(target.getMoney() + money); //1000 + 100
            //5. 更新转出账户数据到数据库
            accountDao.update(source);       // 从连接池中获取连接  connection4
            int i = 10 / 0;//手动制造的算术异常
            //6. 更新转入账户数据到数据库
            accountDao.update(target);    // 从连接池中获取连接  connection5
        } catch (SQLException e) {

        }

    }
}