package com.itheima.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void init(){
        //被@Before标注的方法会在每个测试方法之前执行,一般用来初始化对象
        System.out.println("init");
        //1.创建Calculator对象
        calculator=new Calculator();
    }
    @Test
    public void testAdd(){
        System.out.println("testAdd");
        //2.调用add方法获取结果
        int result = calculator.add(10, 20);
        //3.打印、断言也可以
        System.out.println("result = " + result);
//        Assert.assertEquals(30,result);
    }
    @Test
    public void testSub(){
        //2.调用sub方法获取结果
        int result = calculator.sub(10, 20);
        //3.打印、断言也可以
        System.out.println("result = " + result);
    }
    @After
    public void destroy(){
        //被@After标注的方法会在每个测试方法执行之后执行,一般用来释放资源，例如:IO流对象
        System.out.println("destroy");
    }
}
