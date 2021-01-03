package part_06.April27_session_jsp.session_loginDemo.test;


import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import part_06.April27_session_jsp.session_loginDemo.domain.User;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class BeanUtilsTest {
    @Test
    public void testBeanUtils(){
        try {
            User user1 = new User();
            BeanUtils.setProperty(user1,"username","wangmzi");
            System.out.println(user1);
            //User{id=0, username='wangmzi', password='null', gender='null'}
            String username = BeanUtils.getProperty(user1, "username");
            System.out.println(username);//wangmzi

            User user2 = new User();
            HashMap<String,String> map = new HashMap<>();
            map.put("username","zhangsan");
            map.put("password","zhangsan");
            map.put("id","zhangsan");
            BeanUtils.populate(user2,map);
            System.out.println(user2);
            //User{id=0, username='zhangsan', password='zhangsan', gender='null'}
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
