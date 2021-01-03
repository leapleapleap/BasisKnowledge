package part_06.April27_session_jsp.session_loginDemo.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fail")
public class FailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置content-type,告诉浏览器传送的文件类型、解码方式、servlet编码方式
        response.setContentType("text/html;charset=utf-8");
        //响应对象写出响应信息
        response.getWriter().write("您输入的账号密码有误！登录失败！");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
