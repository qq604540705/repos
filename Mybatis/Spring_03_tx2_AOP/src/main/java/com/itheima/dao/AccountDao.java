package com.itheima.dao;

import com.itheima.domain.Account;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
public interface AccountDao {

    /**
     * 查询账户信息
     *
     * @param username
     * @return
     */
    public Account findByUsername(String username) throws SQLException;

    /**
     * 更新账户信息  根据id进行更新
     * @param account
     */
    public void update(Account account) throws SQLException;
}
