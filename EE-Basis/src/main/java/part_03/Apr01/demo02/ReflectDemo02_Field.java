package part_03.Apr01.demo02;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class ReflectDemo02_Field {


    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*  获取成员变量们
                 * Field[] getFields()
                 * Field getField(String name)

                 * Field[] getDeclaredFields()
                 * Field getDeclaredField(String name)  */

        //1.Field[] getFields() : 获取所有public修饰的成员变量
        test01(personClass);

        //2.Field getField(String name)
        test02(personClass);

        //3.Field[] getDeclaredFields()
        test03(personClass);

        //4.Field getDeclaredField(String name)
        test04(personClass);

        //5.Method getMethod(String name, Class<?>... parameterTypes)
        test05(personClass);


    }

    private static void test05(Class personClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Person p1 = new Person();
        Method setName = personClass.getMethod("setName", String.class);
        setName.invoke(p1,"张三丰");
        Method setAge = personClass.getMethod("setAge", int.class);
        setAge.invoke(p1,88);
        System.out.println(p1);
    }

    private static void test04(Class personClass) throws NoSuchFieldException {
        Field name = personClass.getDeclaredField("name");
        System.out.println(name);
        //Person p1 = new Person();
        //name.setAccessible(true);
        //name.set(p1, "张三丰");
        //System.out.println(p1);

        Field age = personClass.getDeclaredField("age");
        //age.setAccessible(true);
        //age.set(p1, 18);
        //System.out.println(p1);

        //Object o = age.get(p1);
        //System.out.println(o);
    }

    private static void test03(Class personClass) {
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            System.out.println(declaredField.getName());
        }
    }

    private static void test02(Class personClass) throws NoSuchFieldException {
        Field a = personClass.getField("a");
        System.out.println(a);

        //Field name1 = personClass.getField("name"); //NoSuchFieldException: name
    }

    private static void test01(Class personClass) {
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println(field.getName());
        }
    }


}