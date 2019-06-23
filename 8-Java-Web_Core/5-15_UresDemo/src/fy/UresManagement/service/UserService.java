package fy.UresManagement.service;

import fy.UresManagement.domain.User;

import java.util.List;

/*
* 用户管理的业务接口
* */
public interface UserService {
    /**
    *查询所有用户信息
    *
    */
    public List<User>findAll();
    /*
    * 传入一个对象,在数据库中匹配看是否存在该对象
    *
    * */
    public User login(User user);
    /*
    *传入一个对象,将对象存在数据库中
    **/
    public void addUser(User user);
    /**
     * 传入一个id值,去删除该用户数据
     *
     */
    public void deleteUser(int id);
    /**
     * 传入一个ID数组,删除该数组的
     */
    public void deleteSelectUser(String[] uids);
}
