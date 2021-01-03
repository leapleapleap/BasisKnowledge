package part_06.April26_cookie.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieRemove")
public class CookieRemove extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //获取cookie
        Cookie[] cookies = req.getCookies();
        //当存在cookie时
        if (cookies != null && cookies.length >0){
            //遍历cookies
            for (Cookie cookie : cookies) {
                //存在属性名为lastTime的cookie时
                if ("lastTime".equals(cookie.getName())){
                    //删除该cookie
                    cookie.setMaxAge(0);
                    break;
                }
            }
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doPost(req, res);
    }
}
