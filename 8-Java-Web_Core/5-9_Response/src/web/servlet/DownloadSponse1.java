package web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadSponse")
public class DownloadSponse1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //解决中文乱码问题
        request.setCharacterEncoding("utf-8");
        response.setContentType("html/text;charset=utf-8");
        //1.前端页面和Servlet页面连接
        String filename = request.getParameter("filename");
//        获取到图片的绝对路径
        ServletContext context = request.getServletContext();
        String realPath = context.getRealPath("/img/"+filename);
//      将图片加载进内存
        FileInputStream fis=new FileInputStream(realPath);
//        将内存中的图片读取出给客户端下载
        response.setHeader("content-disposition","attachment;filename="+filename);
        ServletOutputStream sos = response.getOutputStream();
        int lin;
        byte[] bytes= new byte[1024];
        while ((lin=fis.read(bytes))!=-1){
            sos.write(bytes,0,lin);
        }
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
