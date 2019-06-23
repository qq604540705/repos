package fy.dao;

import fy.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查方法
     * @return
     */
    public List<User> findAll();

    /**
     * 通过id查询
     * @param id
     * @return
     */
    public User findUserById(Integer id);

    /**
     * 通过模糊查询 查询符合的条件
     * @param address
     * @return
     */
    public List<User> findUserByAddress(String address);

    /**
     * 增加新用户
     * @param user
     * @return
     */
    public Integer addUser(User user);

    /**
     * 通过id删除用户信息
     * @param id
     * @return
     */
    public Integer delUserById(Integer id);

    public Integer updateById(User user);
}
