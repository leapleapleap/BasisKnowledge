package part_06.April27_session_jsp.session_loginDemo.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@SuppressWarnings("all")
@WebServlet("/checkCode")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置验证码的长宽尺寸
        int w = 100;
        int h = 50;
        //获取图片缓冲区，传入长宽参数、颜色类型
        BufferedImage image = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        //创建画笔
        Graphics g = image.getGraphics();
        //设置画笔颜色为粉红色
        g.setColor(Color.pink);
        //填充背景
        g.fillRect(0,0,w,h);
        //设置画笔颜色为红色
        g.setColor(Color.red);
        //画边框(边框本身占一个像素，所以在最大长宽值上要减1)
        g.drawRect(0,0,w-1,h-1);
        //创建随机字符集(字符串形式，也可以是字符数组形式)
        String str = "abcdefjhigklmnopqrstuvwxyzABCDEFJHIGKLMNOPQRSTUVWXYZ0123456789";
        //创建随机数对象
        Random r = new Random();
        //创建可变字符串对象
        StringBuilder sb = new StringBuilder();
        //创建session对象
        HttpSession session = request.getSession();
        //循环生成四位随机数
        for (int i = 1; i <= 4; i++) {
            //在待选字符集中使用随机数获取随机字符作为验证码
            String s = str.charAt(r.nextInt(str.length())) + "";
            //将验证码放置到至相对的位置
            g.drawString(s,w/5*i-3,h/2);
            //获取生成的随机数并存储
            sb.append(s);
        }
        //将可变字符串转为字符串
        String s = sb.toString();
        //给session添加属性，当浏览器登录时在服务器端进行登录信息的比对
        session.setAttribute("code",s);
        //设置画笔颜色为绿色
        g.setColor(Color.green);
        //给验证码画干扰线
        for (int i = 0; i < 5; i++) {
            int x1 = r.nextInt(w);
            int x2 = r.nextInt(w);
            int y1 = r.nextInt(h);
            int y2 = r.nextInt(h);
            //划线
            g.drawLine(x1,y1,x2,y2);
        }
        //将图片使用图片流写出响应输出流中
        ImageIO.write(image,"jpg",response.getOutputStream());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
