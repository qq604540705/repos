package Demo;

import javax.servlet.*;
import java.io.IOException;

public class Demo1 implements Servlet {
    int num=0;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.......");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        num++;
        System.out.println(num);
        System.out.println("service.......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy.......");
    }
}
