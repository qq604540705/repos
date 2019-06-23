package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/6/1/001
 */
public class UserDaoTest {

    private InputStream is;
    private SqlSession sqlSession;
    private UserDao userDao;

    //测试测试方法之前完成对对象的初始化操作
    @Before
    public void init() throws IOException {
        //1. 加载mybatis核心配置文件
        //InputStream is = UserDaoTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2. 创建SqlSessionFactory工厂类对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3. 创建SqlSession对象
        sqlSession = factory.openSession();
        //4. 获取接口的实现类对象(不是我们自己写的,是由mybatis自动生成的) 基于代理类对象的开发方式
        userDao = sqlSession.getMapper(UserDao.class);
    }

    //测试方法执行之后完成资源的释放
    @After
    public void destroy() throws IOException {
        //6. 释放资源
        sqlSession.commit();//做增删改操作的时候需要提交事物
        sqlSession.close();
        is.close();
    }

    @Test
    public void findByCondition() {
        User user=new User();
        user.setUsername("%王%");
        List<User> users = userDao.findByCondition(user);
        for (User user1 : users) {
            System.out.println("user1 = " + user1);
        }
    }

    @Test
    public void deleteByIds() {
        Integer[] a=new Integer[2];
        a[0]=43;
        a[0]=50;
        userDao.deleteByIds(a);
    }

    @Test
    public void deleteByList() {
    }
}