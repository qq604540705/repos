package fy.cookieDemo;
/*
* 网页访问在页面输出上次访问时间,若是第一次访问,则显示欢迎您
* 先判断是有为第一次访问
*   1.若第一次访问则,在页面显示欢迎您访问
*   2.回写Cookie的值,赋这次访问的时间
* 如果不是第一次访问
*   1.读取Cookie的值,显示给浏览器
*   2.回写Cookie的值,赋这次访问的时间
*
*
* */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieDemo1")
public class CookieDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag=false;
        if (cookies!=null &&cookies.length>0){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if (name.equals("lateTime")){
                    String value = cookie.getValue();
                    response.getWriter().write("欢迎您回来"+value);
                    //回写Cookie的值,赋这次访问的时间
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
                    String format = sdf.format(date);
                    cookie.setValue(format);
                    break;
                }
            }
            if (cookies==null||cookies.length==0||flag==false){
                response.getWriter().write("欢迎您访问");
                //回写Cookie的值,赋这次访问的时间
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
                String format = sdf.format(date);
                Cookie cookie=new Cookie("lateTime",format);
                cookie.setMaxAge(60*60*24*30);
                response.addCookie(cookie);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
