package part_06.April24_Response.LoginDemo.test;


import org.junit.Test;
import part_06.April24_Response.LoginDemo.dao.Usersdao;
import part_06.April24_Response.LoginDemo.domain.User;

@SuppressWarnings("all")
public class UserDaoTest {
    @Test
    public void testLogin(){

        User loginUser = new User();
        loginUser.setUsername("zhangsana");
        loginUser.setPassword("123");

        Usersdao usersdao = new Usersdao();
        User u = usersdao.login(loginUser);
        System.out.println(u);
    }
}
