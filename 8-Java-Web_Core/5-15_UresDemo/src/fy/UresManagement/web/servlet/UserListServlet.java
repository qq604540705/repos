package fy.UresManagement.web.servlet;

import fy.UresManagement.domain.User;
import fy.UresManagement.service.UserService;
import fy.UresManagement.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //调用service里面的方法获取到user数据集合
        UserService userService=new UserServiceImpl();
        List<User> UserAll = userService.findAll();
        //将查询到的用户信息转发
        request.setAttribute("UserAll",UserAll);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
