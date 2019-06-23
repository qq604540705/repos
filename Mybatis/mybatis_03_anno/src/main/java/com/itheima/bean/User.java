package com.itheima.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * CREATE TABLE `user` (
 * `id` int(11) NOT NULL auto_increment,
 * `username` varchar(32) NOT NULL COMMENT '用户名称',
 * `birthday` datetime default NULL COMMENT '生日',
 * `sex` char(1) default NULL COMMENT '性别',
 * `address` varchar(256) default NULL COMMENT '地址',
 * PRIMARY KEY  (`id`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
//@Alias("user")
public class User implements Serializable {

    private Integer id;
    private String userName;
    private Date userBirthday;
    private String userSex;
    private String userAddress;

    //一对多关系映射：主表方法应该包含一个从表方的集合引用
    private List<Account> accounts;

    public Integer getUserId() {
        return id;
    }

    public void setUserId(Integer userId) {
        this.id = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userBirthday=" + userBirthday +
                ", userSex='" + userSex + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
