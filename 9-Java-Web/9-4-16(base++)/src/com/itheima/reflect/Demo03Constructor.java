package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class Demo03Constructor {
    @Test
    public void testConstructor() throws Exception{
        //1.获取Class对象
        Class<Person> personClass = Person.class;
        //2.获取Constructor构造方法对象
//        Constructor<?>[] constructors = personClass.getConstructors();
        /*Constructor<?>[] constructors = personClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }*/
        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class,String.class, String.class);
//        System.out.println(constructor);
        //3.通过Constructor对象构造出一个对象
        constructor.setAccessible(true);
        Person person = constructor.newInstance("周杰伦", "1974-10-10", "男");
        System.out.println(person);
    }
}
