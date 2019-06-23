package com.itheima.homework;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    作业1：课堂上的反射案例
    需求：定义一个框架类，这个类中可以执行任意类的任意方法
    要求：
        1.使用反射技术完成
        2.任意类的全类名和要执行的方法名需要使用.Properties配置文件来配置
 */
public class HomeWork1 {
    public static void main(String[] args) throws Exception {
        //1.读取配置文件中的信息(全类名和方法名)
        //1.1 创建Properties对象
        Properties properties=new Properties();
        //1.2 调用load方法加载配置文件
        InputStream is = HomeWork1.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(is);
        //1.3 根据key获取对应的值
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //2.通过反射方式执行该类中的方法(反射的三大步)
        //2.1 获取Class对象
        Class aClass = Class.forName(className);
        //2.2 通过Class对象获取Method对象
        Method method = aClass.getDeclaredMethod(methodName);
        //2.3 调用invoke方法
        Object obj = aClass.newInstance();
        //暴力访问
        method.setAccessible(true);
        method.invoke(obj);
    }
}
