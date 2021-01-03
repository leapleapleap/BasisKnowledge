package part_06.April23_HTTP_Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletDemo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取request的请求方法
        String method = request.getMethod();
        System.out.println(method);
//        获取request的协议及其版本信息
        String protocol = request.getProtocol();
        System.out.println(protocol);
//        获取request的虚拟路径---getContextPath
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
//        获取get方式的请求参数---name1=value1&name2=value2&...
        String queryString = request.getQueryString();
        System.out.println(queryString);
//        获取servlet的路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
//        获取request的URI
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
//        获取request的URL
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
//        获取发出request的IP
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
