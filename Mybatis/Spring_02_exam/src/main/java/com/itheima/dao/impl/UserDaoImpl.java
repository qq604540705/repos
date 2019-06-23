package com.itheima.dao.impl;

import com.itheima.bean.User;
import com.itheima.dao.UserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public void add(User user) throws SQLException {
        String sql = "insert  into `user` values (null,?,?,?,?)";
        queryRunner.update(sql, user.getUsername(), user.getBirthday(), user.getSex(), user.getAddress());
    }

    @Override
    public void update(User user) throws SQLException {
        String sql = "update user set username = ? ,birthday = ? ,sex = ? ,address = ? where id = ? ";
        queryRunner.update(sql, user.getUsername(), user.getBirthday(), user.getSex(), user.getAddress(), user.getId());
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String sql = "delete from user where id = ? ";
        queryRunner.update(sql, id);
    }

    @Override
    public User findById(Integer id) throws SQLException {
        String sql = "select * from user where id = ? ";
        return queryRunner.query(sql, new BeanHandler<User>(User.class), id);
    }

    @Override
    public List<User> findAll() throws SQLException {
        String sql = "select * from user ";
        return queryRunner.query(sql, new BeanListHandler<User>(User.class));
    }
}
