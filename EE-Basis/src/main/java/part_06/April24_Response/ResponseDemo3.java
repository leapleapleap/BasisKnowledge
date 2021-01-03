package part_06.April24_Response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setCharacterEncoding("utf-8");
        response.setHeader("content-type","text/html;charset=utf-8");*/

        response.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = response.getWriter();
//        writer.write("你好哎哎哎!!!");
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write("你好".getBytes("UTF-8"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
