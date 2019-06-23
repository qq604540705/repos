package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Demo02Field {

    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException {
        //1.获取字节码对象，也叫Class对象，有三种方法
        Class<Person> personClass = Person.class;
        //2.获取成员变量对象，Field对象,4个方法
//        Field[] fields = personClass.getFields();//获取所有public修饰的成员变量
        /*Field[] fields = personClass.getDeclaredFields();//获取所有任意修饰符的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }*/
//        Field field = personClass.getField("name");//获取指定名称的public修饰的成员变量
        Field field = personClass.getDeclaredField("sex");
        System.out.println(field);

        //3.操作Field对象：set和get值
        //开启访问权限，暴力访问
        field.setAccessible(true);
        Person person = new Person();
        field.set(person, "男");
        //获取age值
        Object sex = field.get(person);
        System.out.println("sex = " + sex);
    }
}