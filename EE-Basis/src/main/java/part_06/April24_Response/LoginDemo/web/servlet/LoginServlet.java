package part_06.April24_Response.LoginDemo.web.servlet;


import org.apache.commons.beanutils.BeanUtils;
import part_06.April24_Response.LoginDemo.dao.Usersdao;
import part_06.April24_Response.LoginDemo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@SuppressWarnings("all")
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
        response.setContentType("html/text;charset=utf-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
        User loginUser = new User();
        try {
            BeanUtils.populate(loginUser,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Usersdao usersdao = new Usersdao();
        User user = usersdao.login(loginUser);

        if(user == null){
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }else{
            request.setAttribute("user",user);
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
