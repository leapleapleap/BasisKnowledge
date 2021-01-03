package part_06.April26_cookie.download.servlet;



import part_06.April26_cookie.download.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@SuppressWarnings("all")

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取文件名称(根据页面传过来的filename参数来获取)
        String filename = request.getParameter("filename");
        //2. 使用字节输入流加载文件进内存
        //2.1 获取ServletContext对象
        ServletContext context = this.getServletContext(); // HttpServlet中的getServletContext()方法
        //ServletContext context = request.getServletContext(); // HttpServletRequset对象的getServletContext()方法
        //2.2 获取在项目根路径下的子文件夹的物理路径
        String realPath = context.getRealPath("/source/" + filename);
        //2.3 创建文件输入流，将下载的文件地址（部署在服务器端的文件按照其在服务器的真实地址书写）传入输入流中
        FileInputStream fis = new FileInputStream(realPath);

        //3. 设置response响应头
        //3.1 使用获取到的ServletContext对象获取下载文件的MIME类型(在tomcat的conf/目录下web.xml文件中有MIME类型的全集)
        String mimeType = context.getMimeType(filename);
        //3.2 在响应头中添加content-type并将获取到的mime类型传入
        response.setHeader("content-type", mimeType);
        //response.setContentType(mimeType);


        //4. 解决中文文件名问题
        //4.1 获取request的user-agent请求头消息，适配不同的浏览器（解决带有中文文字的文件下载名在下载时出现的乱码问题）
        String agent = request.getHeader("user-agent");
        //4.2 调用转换文件名的工具类（一般使用URL编码来将文件名编码，然后在浏览器端再使用URL解码）
        filename = DownLoadUtils.getFileName(agent, filename);

        //在响应头中添加content-disposition，设置其值为attachment:代表点击下载时以弹出框的形式进行交互
        response.setHeader("Content-disposition","attachment;filename="+filename);

        //5. 将输入流的数据写出到输出流中
        //5.1 使用response对象获取输出流对象
        ServletOutputStream outputStream = response.getOutputStream();
        //5.2 定义字节数组及临时变量
        byte[] bytes = new byte[1024 * 8];
        int len = 0;
        //5.3 边度边写
        while ((len = fis.read(bytes)) != -1) {
            outputStream.write(bytes,0,len);
        }
        //5.4 当输出流结束操作之后手动关闭自己创建的输入流对象
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
