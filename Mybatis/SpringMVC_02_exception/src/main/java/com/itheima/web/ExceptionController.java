package com.itheima.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/test")
    public String testException() throws Exception{
        System.out.println("控制器执行成功...");
        int i = 10/0;
        return "success";
    }
}
