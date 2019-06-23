/*
package fy.UresManagement.Filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter {
    public void destroy() {
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        String uri = request.getRequestURI();
        if (uri.contains("/loginServlet")||uri.contains("/login.jsp")||uri.contains("/css/")||uri.contains("/js/")||uri.contains("/fonts/")||uri.contains("/checkCode")){
            //包含是登录页面
            chain.doFilter(req, resp);
        }else {
            //判断是否存在user
            Object user = request.getSession().getAttribute("user");
            if (user!=null){
                //存在user对象,已经登录
                chain.doFilter(req,resp);
            }else {
                //还没登录,跳转到登录页面
                request.setAttribute("login_msg","还未登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
*/
