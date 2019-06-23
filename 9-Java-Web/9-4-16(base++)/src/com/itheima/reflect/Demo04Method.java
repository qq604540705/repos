package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo04Method {
    @Test
    public void testMethod() throws Exception {
        //1.获取Class对象
        Class<Person> personClass = Person.class;
        //2.通过Class对象获取Method对象
        Method method = personClass.getDeclaredMethod("setName", String.class);
        //3.调用方法 Object invoke(Object obj, Object... args)
        Person person = personClass.newInstance();//通过Class对象也能构造出一个对象，默认执行的是空参构造
        //暴力访问
        method.setAccessible(true);
        Object returnValue = method.invoke(person, "周杰棍");
        //打印person对象
        System.out.println(person);
    }
}
