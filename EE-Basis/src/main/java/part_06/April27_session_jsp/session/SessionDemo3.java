package part_06.April27_session_jsp.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/*
    实现浏览器在开关操作之后能够获取到相同的session对象
 */
@WebServlet("/SessionDemo3")
public class SessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();
        //手动创建cookie，将(JSESSIONID:session.getId())加入响应对象中
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        //设置cookie的生存时间为1小时
        cookie.setMaxAge(60 * 60);
        //给response对象添加cookie
        res.addCookie(cookie);

        System.out.println(session.getAttribute("msg"));
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doPost(req, res);
    }
}
