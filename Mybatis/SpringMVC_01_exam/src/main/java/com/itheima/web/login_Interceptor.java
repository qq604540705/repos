package com.itheima.web;

import com.itheima.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login_Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("前拦截器执行了...");
        HttpSession session = request.getSession();
        User login = (User) session.getAttribute("login");
        System.out.println("login = " + login);
        if (login==null){
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else if (login!=null){
            return true;
        }
        return login!=null;
    }

//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("后执行拦截器执行了...");
//        HttpSession session = request.getSession();
//        User login = (User) session.getAttribute("login");
//        System.out.println("login = " + login);
//        if (login==null){
//            request.getRequestDispatcher("/login.jsp").forward(request,response);
//        }
//    }
}
