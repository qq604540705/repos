package com.itheima.dao;

import com.itheima.bean.Condition;
import com.itheima.bean.Route;
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
import java.util.Calendar;
import java.util.List;

public class RouteDaoTest {
    private SqlSession session;
    private InputStream is;
    private RouteDao routeDao;

    @Before
    public void init() throws IOException {
        //1. 创建sqlSessionBuilder构造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //2. 创建SqlSessionFactory对象
        //2.1 加载配置文件
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.2 构建SqlSession工厂
        SqlSessionFactory sf = builder.build(is);

        //3. 获取SqlSession对象
        session = sf.openSession();

        //4. 获取mapper类的代理对象
        routeDao = session.getMapper(RouteDao.class);
    }

    @After
    public void destroy() throws IOException {
        //提交事物
        session.commit();
        //6. 释放资源
        session.close();
        is.close();
    }


    @Test
    public void findByRidWithImgsAndSeller() {
        Route byRidWithImgsAndSeller = routeDao.findByRidWithImgsAndSeller(1);
        System.out.println("byRidWithImgsAndSeller = " + byRidWithImgsAndSeller);
    }

    @Test
    public void update() {
        Route route = new Route();
        route.setRid(500);
        route.setRname("新疆一日游");
        routeDao.update(route);
    }

    @Test
    public void deleteByIds() {
        List<Integer> integers = new ArrayList<>();
        integers.add(514);
        integers.add(515);
        routeDao.deleteByIds(integers);
    }

    @Test
    public void findByCondition() {
        Condition condition = new Condition();
        condition.setRname("%春节%");
        condition.setMinPrice(1998.00);
        condition.setMaxPrice(2000.00);
        List<Route> byCondition = routeDao.findByCondition(condition);
        for (Route route : byCondition) {
            System.out.println("route = " + route);
        }
    }

    @Test
    public void findAllWithSeller() {
        List<Route> allWithSeller = routeDao.findAllWithSeller();
        for (Route route : allWithSeller) {
            System.out.println(route.getSeller());
        }
    }
}
