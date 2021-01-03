package part_04.Apr09_datasource_JDBCTemplate.demo05;

import java.lang.reflect.Method;
import java.util.HashMap;

@SuppressWarnings("all")
public class PopulateUtils {
    /**
     * 将数据源中的数据封装到T类型的对象中并返回
     * @param map   数据源
     * @param cls   把数据源中数据封装到对象的该对象对应的类
     * @param <T>   自定义的一个泛型
     * @return      返回该对象
     * @throws Exception
     */
    public static <T>T populate(HashMap<String, String> map, Class<T> cls) throws Exception {
        //使用传入的类获得类的实例对象
        T t = cls.newInstance();
        //获取类中的所有方法名称
        Method[] methods = cls.getMethods();
        //循环对方法数组中的每个方法进行操作
        for (Method method : methods) {
            //等到方法的名称
            String name = method.getName();
            //当方法名称以set开头时
            if(name.startsWith("set")){
                //获取去掉对应方法的"set"字符内容的子字符串
                String substring = name.substring(3);
                /**
                 * 为什么不对获取的子字符串直接使用toLowerCase()方法呢？
                 *      假设方法名为setUserName,当去掉set后子字符串为UserName
                 *      若使用toLowerCase()方法，则该子字符串会变为username
                 *      不符合标准类的变量定义规范
                 */
                //获取子字符串第一个字母（该字母必定大写）
                String beginChar = substring.substring(0, 1);
                //对该字母进行操作，将其转为小写字母
                String s = beginChar.toLowerCase();
                //将转化为小写的字母拼接到子字符串去掉第一个字母的子子字符串前面，获得变量名
                String key = s + substring.substring(1);
                //根据获得到的变量名从map集合中获取对应值
                String value = map.get(key);
                //唤醒该方法设置对应实例的该变量的值
                method.invoke(t,value);
            }
        }
        return t;
    }

    /**
     * 将map集合中的数据封装到User对象中
     * @param map
     * @return
     */
    public static User populateUser(HashMap<String, String> map){

        User user = new User();

        String username = map.get("username");
        user.setUsername(username);

        user.setAge(map.get("age"));
        user.setGender(map.get("gender"));
        user.setAddress(map.get("address"));
        user.setPhone(map.get("phone"));

        return user;
    }

    /**
     * 将map集合中的数据封装到Student对象中
     * @param map
     * @return
     */
    public static Student populateStudent(HashMap<String, String> map){
        Student student = new Student();

        String username = map.get("username");
        student.setUsername(username);

        student.setAge(map.get("age"));
        student.setGender(map.get("gender"));
        student.setAddress(map.get("address"));
        student.setPhone(map.get("phone"));

        return student;
    }
}
