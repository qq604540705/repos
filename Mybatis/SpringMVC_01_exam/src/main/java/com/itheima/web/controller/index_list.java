package com.itheima.web.controller;

import com.itheima.bean.User;
import com.itheima.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/web")
public class index_list {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index_list")
    public String findAll(HttpServletRequest request) {
        List<User> all = userService.findAll();
        request.setAttribute("list", all);
        return "list";
    }

    @RequestMapping(path = "/del")
    public String delById(String id, HttpServletRequest request) {
        userService.deleteUser(id);
        return findAll(request);
    }

    @RequestMapping(path = "/add")
    public String add(User user) {
        userService.addUser(user);
        System.out.println("user = " + user);
        return "forward:/web/index_list";
    }

    @RequestMapping(path = "/findById")
    public ModelAndView findById(String id) {
        User user = userService.findUserById(id);
        System.out.println("user = " + user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    /**
     * 修改方法
     *
     * @return
     */
    @RequestMapping(path = "/update")
    public String update(User user) {
        userService.updateUser(user);
        return "forward:/web/index_list";
    }
    @RequestMapping
    public String login_1(){
        return "login";
    }

    @RequestMapping(path = "/login")
    public ModelAndView login(HttpServletRequest request,String username,String password,String verifycode){
        ModelAndView modelAndView=new ModelAndView();
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        if (verifycode.equalsIgnoreCase(checkcode_server)){
            User user = userService.findByUsernameAndPassword(username, password);
            System.out.println("登录功能执行了");
            if (user!=null){
                modelAndView.setViewName("index");
                //登录成功给session里面存个值
                session.setAttribute("login",user);
            }else {
                modelAndView.addObject("login_msg","账号或密码错误");
                modelAndView.setViewName("login");
            }

        }else {
            modelAndView.addObject("login_msg","验证码错误");
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
}
