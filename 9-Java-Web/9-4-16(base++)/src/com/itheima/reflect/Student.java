package com.itheima.reflect;

public class Student {
    public String name;
    protected int age;
    String birthday;
    private String sex;
    public void method(){
        System.out.println("method方法执行了....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
