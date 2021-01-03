package part_06.April24_Response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@SuppressWarnings("all")
@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int w = 100;
        int h = 50;

        BufferedImage image = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);

        Graphics g = image.getGraphics();
        g.setColor(Color.pink);
        g.fillRect(0,0,w,h);

        g.setColor(Color.red);
        g.drawRect(0,0,w-1,h-1);

        String str = "abcdefjhigklmnopqrstuvwxyzABCDEFJHIGKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 1; i <= 4; i++) {
            g.drawString(str.charAt(r.nextInt(str.length()))+"",w/5*i-3,h/2);
        }
        g.setColor(Color.green);
        for (int i = 0; i < 10; i++) {
            int x1 = r.nextInt(w);
            int x2 = r.nextInt(w);
            int y1 = r.nextInt(h);
            int y2 = r.nextInt(h);
            g.drawLine(x1,y1,x2,y2);
        }

        ImageIO.write(image,"jpg",response.getOutputStream());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
