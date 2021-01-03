package part_06.April27_session_jsp.session_loginDemo.web.servlet;



import org.apache.commons.beanutils.BeanUtils;
import part_06.April27_session_jsp.session_loginDemo.dao.Usersdao;
import part_06.April27_session_jsp.session_loginDemo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@SuppressWarnings("all")
@WebServlet("/login")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //设置servlet的编码格式
        req.setCharacterEncoding("utf-8");
        //创建user对象
        User loginUser = new User();
        //获取浏览器传来的客户输入的验证码
        String checkcode = req.getParameter("checkcode");
        //创建session对象
        HttpSession session = req.getSession();
        //获取验证码对比值
        String code = (String) session.getAttribute("code");
        session.removeAttribute("code");
        //当浏览器传来的验证码不为空且与对比值相同时
        if (checkcode != null && checkcode.equalsIgnoreCase(code)) {
            //获取浏览器传来的表单信息
            Map<String, String[]> map = req.getParameterMap();
            if (map != null) {
                try {
                    //使用工具类将相关信息封装称为对象
                    BeanUtils.populate(loginUser, map);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                //创建数据访问对象
                Usersdao usersdao = new Usersdao();
                //调用dao(数据访问对象)中的类，检索数据库中的user表并用user接收检索结果
                User user = usersdao.login(loginUser);
                //判断
                if (user == null) {
                    session.setAttribute("fail_empty", "账户名或者密码输入错误！");
                    res.sendRedirect("/demo/0427_Login.jsp");
                } else {
                    String username = user.getUsername();
                    session.setAttribute("user", username);
                    res.sendRedirect("/demo/0427_success.jsp");
                }
            }
        } else {
            //给session中添加属性，
            session.setAttribute("fail_code", "验证码输出错误，请重新输入！");
            res.sendRedirect("/demo/0427_Login.jsp");
        }


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doPost(req, res);
    }
}
