package fy.study.reflect;

import java.lang.reflect.Method;

@Pro(classname="fy.study.reflect.Person",methodName="abs")
public class Demo5 {
    public static void main(String[] args) throws Exception {
    //创建本类的class对象
    //用.class获取注解的对象
    //调用注解对象获取类名和方法名
        Class<Demo5> demo5Class = Demo5.class;
        Pro pro = demo5Class.getAnnotation(Pro.class);
        String classname = pro.classname();
        String methodName = pro.methodName();
        //用反射 完成调用
        Class<?> aClass = Class.forName(classname);
        //然后用反射的方法,加载出方法
        //首先要获取到类的.class对象
        Method declaredMethod = aClass.getDeclaredMethod(methodName);
        //要new 一个对象.因为不知道类名,所以用class的 newInstance() -->创建此 Class 对象所表示的类的一个新实例。
        Object o = aClass.newInstance();
        //因为可以不是公共的权限,所以使用暴力访问,确保达到目的
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(o);
    }
}
