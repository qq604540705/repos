package com.itheima.dao;

import com.itheima.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface UserDao {

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @Select("select * from user")
    @Results(id = "user_account",value = {
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "userName",column = "username"),
            @Result(property = "userBirthday",column = "birthday"),
            @Result(property = "userSex",column = "sex"),
            @Result(property = "userAddress",column = "address"),
            @Result(column = "id",property = "accounts",
                    many = @Many(select = "com.itheima.dao.AccountDao.findByUid"))
    })
 public List<User> findAll();

    /**
     * 查询根据ID查询用户信息
     *
     * @param uid
     * @return
     */
    @Select("select * from user where id=#{id}")
  public User findById(int uid);

    /**
     * 插入用户数据
     *
     * @param user
     * @return
     */
    @Insert("insert into user values (id=#{id},username=#{username},birthday=#{birthday},)")
    int add(User user);

    /**
     * 更新用户信息
     *
     * @param user
     */
    void update(User user);

    /**
     * 根据用户id删除用户
     *
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 查询总数量
     *
     * @return
     */
   int findTotalCount();


    /**
     * 模糊查询
     * @param name
     * @return
     */
    List<User> findLikeName(String name);
}
