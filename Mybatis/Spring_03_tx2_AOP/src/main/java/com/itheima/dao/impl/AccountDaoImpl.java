package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 *
 */
public class AccountDaoImpl implements AccountDao {

    private JdbcUtils jdbcUtils  ;

    private QueryRunner  queryRunner ;

    public void setJdbcUtils(JdbcUtils jdbcUtils) {
        this.jdbcUtils = jdbcUtils;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Account findByUsername(String username) throws SQLException {
        String sql = "select * from account where username = ? ";
        return queryRunner.query(jdbcUtils.getConnection(),sql,new BeanHandler<Account>(Account.class),username);
    }

    @Override
    public void update(Account account) throws SQLException {
        String sql = "update account set username = ? ,money = ? where id = ? ";
        queryRunner.update(jdbcUtils.getConnection(),sql,account.getUsername(),account.getMoney(),account.getId());
    }
}
