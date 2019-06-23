package com.itheima.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    需求：自己设计一个框架类（Demo05ReflectTest），这个可以执行任意类的任意空参方法
    分析：
        传统方式创建对象，然后调用该对象的方法的方式不通用
        只能使用反射去做。
            条件：
                1.要执行那个类的方法，把这个类告诉我？主要使用用来获取Class对象
                2.把要执行的方法也告诉我：主要是用来获取Method对象
        框架设计的原则是：用户不修改框架的源代码，
        解决办法：给用户提供一个配置文件，用户该配置文件就行了，一般配置文件使用属性文件
 */
public class Demo05ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        //1.1创建Properties对象
        Properties properties=new Properties();
        //1,2 调用load方法加载配置文件
//        FileInputStream fis=new FileInputStream("day14_junit_reflect_annotation\\src\\pro.properties");
        //如果配置文件在src目录，那么可以使用类加载读取配置文件
        InputStream is = Demo05ReflectTest.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(is);
        //1.3 获取参数值
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //2.执行反射操作
       //2.1.通过forName方法获取Class对象
        Class aClass = Class.forName(className);
        //2.2.获取Method对象
        Method method = aClass.getDeclaredMethod(methodName);
        //2.3.执行method方法
        Object obj = aClass.newInstance();//创建对象
        method.invoke(obj);//执行空参方法
    }
}
