package part_01.Mar13.demo05;

public class Person {
    static {
        System.out.println("静态代码块执行了");
    }

    {
        System.out.println("构造代码块执行了");
    }
    public Person(int age) {
        System.out.println("一个"+age+"岁的人就这样被创建了");
    }

    public Person() {
        System.out.println("一个人就这样被创建了");
    }
    {
        System.out.println("后面的构造代码块执行了");
    }
}
