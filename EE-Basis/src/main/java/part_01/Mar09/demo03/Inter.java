package part_01.Mar09.demo03;

/*  接口中：
        成员变量：
            只能是常量 默认修饰符：public static final
        构造方法：
            没有，因为接口主要是扩展功能的，而没有具体存在
        成员方法：
            只能是抽象方法，默认修饰符：public abstract
            关于接口中的方法，JDK8和JDK9中有一些新特性，后面讲解  */
public interface Inter {
    //接口中可以有成员变量但是只能是常量且其默认修饰符为 public static final
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;

    //成员方法默认修饰符：public abstract
    public abstract void method();

    void show();
}
