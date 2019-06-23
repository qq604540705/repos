package com.itheima.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示自定义注解可以写的位置，可以写在类上、方法上、成员变量上...
@Retention(RetentionPolicy.RUNTIME)//表示注解存在的时期，源码期、编译期、运行期，一般自定义注解都是运行期
public @interface Anno1 {
    //String name();
    int age() default 0;
    String[] msg() default {};
    //boolean isMan();

    String value();
}
