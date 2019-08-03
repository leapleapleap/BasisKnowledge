package part_03.Apr01.demo03;


import part_03.Apr01.demo02.Person;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings("all")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //创建properties对象
        Properties p = new Properties();
        //获取Person类到Class对象的类加载器
        ClassLoader classLoader = Person.class.getClassLoader();
        //调用ClassLoader的getResourceAsStream方法获取指定文件的输入流
        InputStream is = classLoader.getResourceAsStream("reflection.properties");
        //使用properties对象的load方法接收输入流
        p.load(is);

        //获取类名、方法名
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        //根据类名创建class对象
        Class cls = Class.forName(className);
        //使用class对象的newInstance方法创建对象
        Object o = cls.newInstance();
        //使用class对象的getMethod方法获取指定名称的方法
        Method method = cls.getMethod(methodName);
        //反射机制使用invoke方法run方法
        method.invoke(o);
    }
}
