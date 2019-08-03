package part_03.Apr01.demo02;

import java.lang.reflect.Method;

@SuppressWarnings("all")
public class ReflectDemo04_Method {


    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        // Class personClass = Person.class;
        Class personClass = Class.forName("_0401_stu_Junit_reflect_annotation.demo02_domain.Person");
        /*  3. 获取成员方法们：
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>... parameterTypes)

             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>... parameterTypes)    */
        Person p = new Person();

        Method eat = personClass.getMethod("eat");
        eat.invoke(p);

        /*  Method[] methods = personClass.getMethods();
            for (Method method : methods) {
                System.out.println(method);
                System.out.println(method.getName());
            }   */

        /*  Method eat_str = personClass.getMethod("eat", String.class);
            System.out.println(eat_str.invoke(p, "饭"));   */

        Method eat_method3 = personClass.getMethod("eat", int.class);
        //执行方法
        Object invoke = eat_method3.invoke(p, 10);

        System.out.println("invoke:" + invoke);

        //获取类名
        String className = personClass.getName();
        System.out.println(className);


    }


}
