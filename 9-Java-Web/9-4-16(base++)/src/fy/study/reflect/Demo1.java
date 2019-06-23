package fy.study.reflect;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

public class Demo1 {
    @Before
    public void textPerson1(){
        Person person=new Person();
    }

    @Test
    public void textPerson2() throws ClassNotFoundException {
        Class<Person> personClass1 = Person.class;
        System.out.println(personClass1);
        Class<? extends Person> personClass2 = new Person().getClass();
        System.out.println(personClass2);
        Class<?> personClass3 = Class.forName("fy.study.reflect.Person");
        System.out.println(personClass3);
    }
    @Test
    public void textPerson4() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field age = personClass.getDeclaredField("age");
        Person person = new Person();
        age.set(person,18);
        System.out.println(age);
        Object o = age.get(person);
        System.out.println("o = " + o);
    }

   /* @Test
    *//*public void textPerson3(){
        Person person=new Person();
        Assert.assertEquals("hello",person.abs("hello"));
    }*/
}
