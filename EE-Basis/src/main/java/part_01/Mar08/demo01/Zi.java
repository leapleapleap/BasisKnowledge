package part_01.Mar08.demo01;

@SuppressWarnings("all")
public class Zi extends Fu {
    public int height = 175;
    public int age = 20;

    //子类无参构造器
    public Zi() {
        //super();
        System.out.println("子类无参构造器");
    }

    //子类带参构造器
    public Zi(String name) {
        System.out.println("子类带参构造器");
    }

    public void show() {
        int age = 30;
        System.out.println("父类的成员变量age：" + super.age);//40
        System.out.println("本类的成员变量age：" + this.age);//20
        System.out.println("本类的局部变量age：" + age);//30
        System.out.println(height);
    }
}
