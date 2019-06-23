package com.itheima.exception;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class WebException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.addObject("exception","服务器挂掉了" );
       modelAndView.setViewName("error");
       return modelAndView;
    }
}
