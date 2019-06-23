package fy.dao;


import fy.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    private  InputStream is;
    private SqlSession sqlSession;
    private UserDao userDao;


    @Before
    public void init(){
        //1. 创建sqlSessionBuilder构造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //读取配置文件,通过mybatis提供的resources对象读取
        is = UserDaoTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        //2. 获取sqlSession工厂对象  sqlSessionFactory
        //2.1 获取SqlSessionFactory的构建者对象
        //2.2. 获取sqlSession工厂对象
        SqlSessionFactory sf = builder.build(is);
        //3. 获取sqlSession对象
         sqlSession = sf.openSession();
        //4. 使用SqlSession创建dao接口的代理对象
         userDao = sqlSession.getMapper(UserDao.class);
    }
    @After
    public void destroy() throws IOException {
        //提交事务
        sqlSession.commit();
        //释放资源
        is.close();
        sqlSession.close();
        userDao.hashCode();
    }
    @Test
    public void findAll() throws IOException {
        //5. 使用代理对象执行查询所有方法
        List<User> users = userDao.findAll();
        System.out.println(users);
    }


    @Test
    public void findUserById() {
        User userById = userDao.findUserById(48);
        System.out.println("userById = " + userById);
    }

    @Test
    public void findUserByAddress() {
        List<User> list = userDao.findUserByAddress("%金燕龙%");
        for (User user : list) {
            System.out.println("user = " + user);
        }
    }

    @Test
    public void addUser() {
        User user=new User();
        user.setUsername("zhangsan");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京");
        Integer integer = userDao.addUser(user);
        System.out.println("integer = " + integer);
        int id = user.getId();
        System.out.println("id = " + id);
    }

    @Test
    public void delUserById() {
        Integer integer = userDao.delUserById(42);
        System.out.println("integer = " + integer);
    }

    @Test
    public void updateById() {
        User user=new User();
        user.setId(43);
        user.setUsername("lisi");
        Integer integer = userDao.updateById(user);
        System.out.println("integer = " + integer);
    }
}