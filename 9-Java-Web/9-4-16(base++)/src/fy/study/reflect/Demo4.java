package fy.study.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo4 {
    public static void main(String[] args) throws IOException, Exception {
        //定义一个唯一能和流使用的集合
        Properties properties = new Properties();
        //用properties集合调用流方法
        //使用类加载器调用流,因为类加载器可以加载class文件,所以也可以加载其他的文件,得到一个输出流
        InputStream is = Demo4.class.getClassLoader().getResourceAsStream("pro.properties");
        //让输出流在集合中加载输出
        properties.load(is);
        //再用集合得到文件中的2个内容,一个是类名,一个是方法名
        //类名
        String className = properties.getProperty("className");
        //对象名
        String methodName = properties.getProperty("methodName");
        //然后用反射的方法,加载出方法
        //首先要获取到类的.class对象
        Class<?> aClass = Class.forName(className);
        //然后通过.class对象获取方法的对象
        Method declaredMethod = aClass.getDeclaredMethod(methodName);
        //要new 一个对象.因为不知道类名,所以用class的 newInstance() -->创建此 Class 对象所表示的类的一个新实例。
        Object o = aClass.newInstance();
        //因为可以不是公共的权限,所以使用暴力访问,确保达到目的
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(o);
    }
}
