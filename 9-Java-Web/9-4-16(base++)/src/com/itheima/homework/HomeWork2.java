package com.itheima.homework;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    作业2：修改课堂上的反射案例
    需求：定义一个框架类，这个类中可以执行任意类的任意方法
    要求：
        1.使用反射技术完成
        2.使用注解来代替配置文件
 */
@Pro(className = "com.itheima.reflect.Student", methodName = "method")
public class HomeWork2 {
    public static void main(String[] args) throws Exception {
        //1.从注解中读取参数值
        //1.1 获取HomeWork2的Class对象
        Class<HomeWork2> homeWork2Class = HomeWork2.class;
        //1.2 判断是否有注解，如果有就获取注解对象
        if(homeWork2Class.isAnnotationPresent(Pro.class)){
            //Method mainMethod = homeWork2Class.getMethod("main", String[].class);
            Pro pro = homeWork2Class.getAnnotation(Pro.class);
            //1.3 通过注解对象获取属性值
            String className = pro.className();
            String methodName = pro.methodName();

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
}
