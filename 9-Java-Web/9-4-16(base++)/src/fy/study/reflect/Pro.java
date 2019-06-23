package fy.study.reflect;


import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Pro {
    String classname();
    String methodName();
}
