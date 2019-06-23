package regist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
    1.获取到浏览器的账号以及密码
    2.调用链接数据库的类,将数据传过去,然后用数据库返回的值来判断是否登录成功
*/
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.获取到浏览器的账号以及密码
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String password = request.getParameter("password");
        System.out.println("password = " + password);
//        2.调用链接数据库的类,将数据传过去,然后用数据库返回的值来判断是否登录成功
        GetData getData = new GetData();
        boolean result=false;
        try {
            result = getData.getBasesData(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(username+"您好,欢迎您");
        }else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("账号或密码错误");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
