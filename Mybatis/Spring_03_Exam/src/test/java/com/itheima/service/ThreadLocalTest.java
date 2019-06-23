package com.itheima.service;

/**
 * @Author 王磊
 * @Date 2019/6/11/011
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "执行了...");
        // ThreadLocal 线程局部变量,其中可以保存数据,保存的数据只能在当前线程之中使用
        ThreadLocal threadLocal = new ThreadLocal() ;
        threadLocal.set("zhangsan");

        //开启线程
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了...");
                String string = (String) threadLocal.get();
                System.out.println("在"+Thread.currentThread().getName()+"中获取threadLocal数据"+string);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了...");
            }
        });

        thread1.start();
        thread2.start();

        String string = (String) threadLocal.get();
        System.out.println("在主线程中获取threadLocal数据"+string);
    }

}
