package part_06.April23_HTTP_Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/servlet")
public class  Servletdemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置servlet的编码格式
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        System.out.println(name);
        String age = request.getParameter("age");
        System.out.println(age);
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            System.out.println(parameterNames.nextElement());
        }
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String s : parameterMap.keySet()) {
            System.out.println(s);
            String[] strings = parameterMap.get(s);
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
