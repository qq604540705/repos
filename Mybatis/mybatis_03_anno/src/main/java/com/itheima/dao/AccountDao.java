package com.itheima.dao;

import com.itheima.bean.Account;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.mybatis.caches.redis.RedisCache;

import java.util.List;

public interface AccountDao {

    /**
     * 查询所有账户信息
     *
     * @return
     */
    @Select("select * from account")
   public List<Account> findAll();

    /**
     * 根据用户id查询用户的所有账户信息
     * @param uid
     * @return
     */
    @Select("select * from account where UID=#{id}")
    public List<Account> findByUid(int uid);
}
