package fy.UresManagement.web.servlet;

import fy.UresManagement.domain.User;
import fy.UresManagement.service.UserService;
import fy.UresManagement.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/*
*
* 登录的界面层
* */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        //先获取到页面的数据
        //页面获取的验证码
        String verifycode = request.getParameter("verifycode");
        //获取验证码生成页面的验证码
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        //先判断验证码是否正确
        if (!checkcode_server.equalsIgnoreCase(verifycode)){
            //验证码错误
            request.setAttribute("login_msg","验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        //验证码正确,封装登录页面的数据到User对象
        User user=new User();
        //获取所有的的请求,装到一个MAP集合中
        Map<String, String[]> map = request.getParameterMap();
        //封装成User对象
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //然后将数据和数据库中的数据匹配,返回结果
        UserService userServiceImpl=new UserServiceImpl();
        User login = userServiceImpl.login(user);
        //判断返回的结果是否为null ,若为null说明账号或密码错误
        if (login==null){
            //若为null说明账号或密码错误
            request.setAttribute("login_msg","账号或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
            //登录成功跳转到查询页面,
            session.setAttribute("user",user);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
        //将结果返回到前端页面

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
