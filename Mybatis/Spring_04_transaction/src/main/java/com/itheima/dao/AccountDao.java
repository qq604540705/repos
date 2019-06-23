package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 * 使用Spring-jdbc完成CRUD操作
 */
public interface AccountDao {

    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据用户名查询账户信息
     * @return
     */
    public Account findByUsername(String username );

    /**
     * 查询总数量
     * @return
     */
    public Integer findTotalcount();

    /**
     * 添加账户
     * @param account
     */
    public void add(Account account);

    /**
     * 根据账户对象中的id更新数据
     * @param account
     */
    public void update(Account account);

    /**
     * 删除数据
     * @param id
     */
    public void deleteById(Integer id);

}
