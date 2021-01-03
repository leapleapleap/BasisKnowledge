package part_06.April26_cookie.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/*
    在服务器中的Servlet判断是否有一个名为lastTime的cookie
     1. 有：不是第一次访问
         1. 响应数据：欢迎回来，您上次访问时间为:2018年6月10日11:50:20
         2. 写回Cookie：lastTime=2018年6月10日11:50:01
     2. 没有：是第一次访问
         1. 响应数据：您好，欢迎您首次访问
         2. 写回Cookie：lastTime=2018年6月10日11:50:01
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //设置servlet的编码格式
//        req.setCharacterEncoding("utf-8");
        //告知浏览器传递的文件的类型、建议解码格式、servlet的编码格式
        res.setContentType("text/html;charset=utf-8");
        //设置标记(当找到键名为lastTime的cookie是设置值为true，否在恒为false)
        Boolean flag = false;
        //获取客户端会话cookie数组
        Cookie[] cookies = req.getCookies();
        //当cookie数组存在(request中存在cookie)且cookie数组的长度大于0时
        if (cookies != null && cookies.length > 0) {
            //变量cookie数组
            for (Cookie cookie : cookies) {
                //当cookie数组中存在键名为lastTime的键时
                if ("lastTime".equals(cookie.getName())) {
                    //将标签赋值为true
                    flag = true;
                    //获取上次访问的时间
                    String before = cookie.getValue();
                    //获取当前时间
                    GetTime now = new GetTime();
                    String time = now.getTime();
                    //创建新的cookie并将当前时间出入，新的cookie由于属性名为lastTime，会将旧的cookie覆盖掉
//                    Cookie newCookie = new Cookie("lastTime",time);
                    //设置cookie的存活时间
//                    newCookie.setMaxAge(60 * 60 * 24 * 30);
                    //添加cookie到响应中
//                    res.addCookie(newCookie);

                    //设置cookie的值
                    cookie.setValue(time);
                    //设置cookie的存活时间(正数为存活，单位为秒)
                    cookie.setMaxAge(60 * 60 * 24 * 30);
                    //将cookie添加到response中
                    res.addCookie(cookie);
                    //将获取到的上次访问时间使用utf-8解码
                    before = URLDecoder.decode(before,"utf-8");
                    //将结果写出到页面
                    res.getWriter().write("<h1>欢迎回来，您上次访问时间为:" + before + "</h1>");
                    //跳出for循环
                    break;
                }
            }
        }
        //如果cookies不存在或者其长度为0或者在获取的cookies中没有键值为lastTime的键值对
        if (cookies == null || cookies.length == 0 || flag == false) {
            //获取时间
            GetTime getTime = new GetTime();
            String time = getTime.getTime();
            //创建cookie并且将时间写入
            res.addCookie(new Cookie("lastTime", time));
            //页面输出结果
            res.getWriter().write("<h1>您好，欢迎您首次访问</h1>");
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doPost(req, res);
    }
}
