package part_01.Mar13.demo04;

public class Teacher extends Human {
    //静态代码块
    static {
        System.out.println("子类的静态代码块执行了~~~");
    }

    public Teacher(){
        System.out.println("子类的构造方法执行了~~~");
    }
}
