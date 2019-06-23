package com.itheima.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 日志工具类
 */
@Component
@Aspect
public class Logger {

    public void printLog(){
        System.out.println("打印日志");
    }

    @Around("execution(* com.itheima.service.impl.AccountServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp){
        Object proceed =null;
        try {
            Object[] args = pjp.getArgs();
            System.out.println("环绕通知,前置通知");
            proceed = pjp.proceed(args);
            System.out.println("环绕通知,后置通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知,异常通知");
        }finally {
            System.out.println("环绕通知,最终通知");
        }
        return proceed;
    }
}