package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/6/1/001
 *
 *
 *
 */
public interface UserDao {

    /**
     * 根据条件查询用户信息
     * @param user
     * @return
     */
    public List<User> findByCondition(User user);

    /**
     * 根据id批量删除用户
     *
     * delete from user where id in (4,5,6)
     *
     * @param ids
     */
    public void deleteByIds(Integer[] ids);

    /**
     * 根据id批量删除用户
     *
     * delete from user where id in (4,5,6)
     *
     * @param ids
     */
    public void deleteByList(List<Integer> ids);

}
