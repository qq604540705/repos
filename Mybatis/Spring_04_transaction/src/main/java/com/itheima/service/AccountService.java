package com.itheima.service;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 */
public interface AccountService {

    /**
     * 涨涨功能
     * @param sourceName 转出账户
     * @param targetName 转入账户
     * @param money      转账金额
     */
    public void transfer(String sourceName,String targetName,Double money);
}
