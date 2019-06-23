package com.itheima;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(path="/hello")
    public String sysHello(){
        System.out.println("程序执行了");
        return "success";
    }
}
