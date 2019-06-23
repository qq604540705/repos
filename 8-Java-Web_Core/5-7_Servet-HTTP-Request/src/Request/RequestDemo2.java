package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("requestURL = " + requestURL);
        System.out.println("----------");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println("s = " + s);
        }
        System.out.println("-----------");
        String referer = request.getHeader("referer");
        System.out.println("referer = " + referer);
    }
}
