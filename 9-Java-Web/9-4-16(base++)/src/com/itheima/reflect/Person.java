package com.itheima.reflect;

public class Person {
    public String name;
    protected int age;
    String birthday;
    private String sex;


    public Person() {
    }
    private Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }
    public Person(String name, int age, String birthday, String sex) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void show(){
        System.out.println("show方法执行了...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
