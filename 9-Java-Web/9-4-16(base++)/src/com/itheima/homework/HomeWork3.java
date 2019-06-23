package com.itheima.homework;

import com.itheima.reflect.Person;
import com.itheima.reflect.Student;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    作业三：
    需求：在该类(HomeWork3)中定义一个静态方法：public static void populate(Object obj,Map<String,Object> map){}方法，
    这个方法能将map集合中的数据封装到一个obj对象中，obj是一个用户传递的任意对象。
    要求：map集合的key要和obj对象的成员变量一一对应。

    例如：
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("name","周杰棍的双截伦");
        map.put("age",48);
        map.put("birthday","1971-10-10");
        map.put("sex","男");

        public class Person {
            public String name;
            protected int age;
            String birthday;
            private String sex;

            //构造方法、getter/setter、toString()方法省略
        }
        提示：
            1.通过反射成员变量的方式给成员变量赋值
            2.通过反射setXXX方法给成员变量赋值
 */
public class HomeWork3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.创建一个Person对象
//        Person person=new Person();
        Student student=new Student();
        //2.创建Map集合对象
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("name","周杰棍的双截伦");
        map.put("age",48);
        map.put("birthday","1971-10-10");
        map.put("sex","男");
        //3.调用populate方法，传递map集合和person对象，将map集合中的数据封装到我给的person对象身上。
        populate(student,map);
        System.out.println(student);
    }
    //完成该方法中的代码
    public static void populate(Object obj,Map<String,Object> map) throws NoSuchFieldException, IllegalAccessException {
        //1.获取obj的Class对象
        Class aClass = obj.getClass();
        //2.获取map集合的所有key，遍历所有的key
        Set<String> keys = map.keySet();
        for (String key : keys) {//key="name"、"age"、"birthday"、"sex"
            //3.在遍历中从Class对象身上获取指定名称(key对应的名称)的Field对象
            Field field = aClass.getDeclaredField(key);
            //4.如果找到了，那么就调用set方法赋值
            if(field!=null){
                //获取map集合中key对应的value值
                Object value = map.get(key);
                //给成员变量赋值
                field.setAccessible(true);
                field.set(obj,value);
            }
        }
    }
}
