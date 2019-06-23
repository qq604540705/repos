package fy.UresManagement.dao;

import fy.UresManagement.domain.User;

import java.util.List;
/*
* 用户操作的DAO
* */
public interface UserDao {
/*
*   获取所有用户的信息封装到User对象中
* */
    public List<User>findAll();
    /*
    * 查询账号密码
    * */
    public User findUsernameAndPassword(String username,String password);
    public void  addUser(User user);
    /*
    * 传入ID删除用户信息
    *
    * */
    public void deleteUser(int id);
}
