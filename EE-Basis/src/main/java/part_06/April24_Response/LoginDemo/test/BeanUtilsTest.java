package part_06.April24_Response.LoginDemo.test;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import part_06.April24_Response.LoginDemo.domain.User;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {
    @Test
    public void testBeanUtils(){
        try {
            User user = new User();
            BeanUtils.setProperty(user,"username","wangmzi");
            System.out.println(user);
            String username = BeanUtils.getProperty(user, "username");
            System.out.println(username);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
