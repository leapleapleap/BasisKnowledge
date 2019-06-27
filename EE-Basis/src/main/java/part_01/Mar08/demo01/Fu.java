package part_01.Mar08.demo01;

@SuppressWarnings("all")
public class Fu {
    public int age = 40;

    //父类无参构造器
    public Fu() {
        System.out.println("父类无参构造器");
    }

    //父类带参构造器
    public Fu(String name) {
        System.out.println("父类带参构造器");
    }


    public void eat() {
        System.out.println("父类成员方法eat()");
    }

}
