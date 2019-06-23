package com.itheima.service;

import com.itheima.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll() throws SQLException;
}
