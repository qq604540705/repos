package com.itheima.reflect;

import org.junit.Test;

/*
    第一步：获取Class对象，有三种方法
    public final class Class<T> extends Object
        Class 没有公共构造方法。Class 对象是在加载类时由 Java 虚拟机以及通过调用类加载器中的 defineClass 方法自动构造的。
    方式1：通过类名获取  类名.class
    方式2：通过对象获取  对象名.getClass();
    方式3：通过Class类的静态forName(String className)方法获取
 */
public class Demo01Class {

    @Test
    public void testClass() throws ClassNotFoundException {
        //方式1：通过类名获取  类名.class
        Class<Person> personClass1 = Person.class;
        System.out.println(personClass1);
       //方式2：通过对象获取  对象名.getClass();
        Person person=new Person();
        Class<Person> personClass2 = (Class<Person>) person.getClass();
        System.out.println(personClass2);
        //方式3：通过Class类的静态forName(String className)方法获取
        Class personClass3 = Class.forName("com.itheima.reflect.Person");
        System.out.println(personClass3);
        //问题：personClass1、personClass2、personClass3是不是同一个对象？是同一个
        System.out.println(personClass1==personClass2);//true
        System.out.println(personClass1==personClass3);//true
    }

}
