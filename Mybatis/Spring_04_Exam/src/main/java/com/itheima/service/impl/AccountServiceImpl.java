package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl() ;

    public void transfer(String sourceName, String targetName, Double money) {
        //1. 查询转出账户
        Account source = accountDao.findByUsername(sourceName);
        //2. 查询转入账户
        Account target = accountDao.findByUsername(targetName);
        //3. 给转出账户扣钱
        source.setMoney(source.getMoney()-money);
        //4. 给转入账户加钱
        target.setMoney(target.getMoney()+money);
        //5. 更新转出账户余额到数据库
        accountDao.update(source);
        //6. 更新转入账户余额到数据库
        accountDao.update(target);
    }
}
