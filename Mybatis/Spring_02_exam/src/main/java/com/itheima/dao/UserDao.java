package com.itheima.dao;

import com.itheima.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    /**
     * 添加用户
     * @param user
     */
    void add(User user) throws SQLException;

    /**
     * 更新用户
     * @param user
     */
    void update(User user) throws SQLException;

    /**
     * 删除用户
     * @param id
     */
    void delete(Integer id) throws SQLException;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(Integer id) throws SQLException;

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll() throws SQLException;

}
