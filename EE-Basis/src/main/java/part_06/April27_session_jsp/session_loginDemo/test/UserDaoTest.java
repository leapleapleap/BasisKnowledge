package part_06.April27_session_jsp.session_loginDemo.test;


import org.junit.Test;
import part_06.April27_session_jsp.session_loginDemo.dao.Usersdao;
import part_06.April27_session_jsp.session_loginDemo.domain.User;

@SuppressWarnings("all")
public class UserDaoTest {
    @Test
    public void testLogin(){

        User loginUser = new User();
        loginUser.setUsername("zhangsan");
        loginUser.setPassword("123");

        Usersdao usersdao = new Usersdao();
        User u = usersdao.login(loginUser);
        System.out.println(u);
    }
}
