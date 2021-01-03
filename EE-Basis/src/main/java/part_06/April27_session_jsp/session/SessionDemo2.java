package part_06.April27_session_jsp.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SessionDemo2")
public class SessionDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();
        //从session中获取信息（在已知该信息的类型为String类型时可以强转类型）
        String msg = (String) session.getAttribute("msg");
        //在控制台输出获取到的session内容
        System.out.println(msg);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doPost(req, res);
    }
}
