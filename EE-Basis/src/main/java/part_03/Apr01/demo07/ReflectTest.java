package part_03.Apr01.demo07;

import java.lang.reflect.Method;

/**
 * 框架类
 */
@Pro(className = "part_03.Apr01.demo07.Demo",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        /*  前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法  */
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
            //注解其根本是一个接口中定义了一些抽象方法，当获得到注解对象后，通过对象调用方法就能获取注解中传递的信息
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
