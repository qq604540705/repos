package com.itheima.service;

import java.sql.SQLException;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
public interface AccountService {

    /**
     * 转账功能
     * @param sourceUsername  转出账户用户名
     * @param targetUsername  转入账户用户名
     * @param money   转账金额
     */
    public void transfer(String sourceUsername ,String targetUsername, Double money ) throws SQLException;
}
