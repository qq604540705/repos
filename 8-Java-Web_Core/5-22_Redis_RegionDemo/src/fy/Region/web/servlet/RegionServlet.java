package fy.Region.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import fy.Region.service.RegionService;
import fy.Region.service.impl.RegionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/** 获取前端页面传过来的AJAX请求
 *  调用service业务逻辑里面的方法获得,请求需要的省份信息
 *  将信息封装到json对象中传给前端页面
 *
 */
@WebServlet("/regionServlet")
public class RegionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //调用查询逻辑
        RegionService regionService=new RegionServiceImpl();
        String all = regionService.findAll();
        //将对象转为json字符串
        ObjectMapper mapper=new ObjectMapper();
        String json = mapper.writeValueAsString(all);
        //把json作为返回值,返回给前端页面
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
