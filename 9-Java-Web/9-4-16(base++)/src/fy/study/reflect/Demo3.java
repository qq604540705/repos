package fy.study.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo3 {
    public static void main(String[] args) throws IOException, Exception {
        //获取类目以及方法名
        Properties properties = new Properties();
        InputStream is = Demo3.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(is);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //类加载器,获取类名
        Class<?> aClass = Class.forName(className);
        //获取类里面的方法名
        Method declaredMethod = aClass.getDeclaredMethod(methodName);
        //新建类对象
        Object o = aClass.newInstance();
        declaredMethod.invoke(o);
    }
}
