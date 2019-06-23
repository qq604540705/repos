package fy.UresManagement.web.servlet;

import fy.UresManagement.service.UserService;
import fy.UresManagement.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * 删除的业务层
 */
@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //将list前端页面获取到要删除的ID获取到
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);
        UserService userService=new UserServiceImpl();
        userService.deleteUser(userId);
        request.getRequestDispatcher("/userListServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
