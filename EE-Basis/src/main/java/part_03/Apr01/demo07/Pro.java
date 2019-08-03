package part_03.Apr01.demo07;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述需要执行的类名，和方法名
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();
    String methodName();
}
/*  使用自定义注解代替配置文件的步骤：
        1.撰写自定义注解
          1.1在自定义注解上添加元注解（指定保留时期，指定我们这个注解的作用位置）
          1.2在自定义注解上添加抽象方法用来保存类名和方法名
        2.在需要使用反射的类中使用自定义注解，添加类名和方法名
        3.解析注解
        4.拿到属性值后，通过反射机制来创建对象并调用方法   */