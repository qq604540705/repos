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

@WebServlet("/downloadSponse2")
public class DownloadSponse2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //解决中文乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("html/text;charset=utf-8");
        //确定后台代码和前端页面已经建立连接
//        System.out.println("d2......");
        //获取到前端页面图片的名字
        String filename = request.getParameter("filename");
//        System.out.println("filename = " + filename);
        //获取前端页面的图片的真实路径,用来从服务器硬盘中读取到内存中
        ServletContext context = request.getServletContext();
        String realPath = context.getRealPath("/img/"+filename);
        //求出文件的类型,拼接到文件的末尾让下载的时候能是正确格式
        String mimeType = context.getMimeType(filename);
//        System.out.println("mimeType = " + mimeType);
        System.out.println("realPath = " + realPath);
//        修改响应头信息,让前端页面跳转到servlet类的时候可以弹出下载框
        response.setHeader("content-disposition","attachment;filename="+filename);
        //本地文件读取流,读取文件到内存中
        FileInputStream fis=new FileInputStream(realPath);
        //服务器输出流,将内存中的文件,输出到客户端
        ServletOutputStream sos = response.getOutputStream();
        int lin;
        byte[] bytes = new byte[1024];
        while ((lin=fis.read(bytes))!=-1){
            sos.write(bytes,0,lin);
        }
        //关流
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
