package servlet;

import dao.UserDao2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/zc2")
public class Zc2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        boolean b = UserDao2.setUser(username, password);
        if (b){
            response.setContentType("text/http;charset=utf-8");
            response.getWriter().write("注册成功");
            response.sendRedirect("http://localhost:8080/login.html");
        }else {
            response.setContentType("text/http;charset=utf-8");
            response.getWriter().write("账号或密码不能为空");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
