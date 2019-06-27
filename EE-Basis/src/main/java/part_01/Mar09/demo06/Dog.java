package part_01.Mar09.demo06;

public class Dog extends Animal implements Swimming {
    //无参构造器
    public Dog() {
    }
    //带参构造器
    public Dog(int age) {
        super(age);
    }

    //重写父类抽象方法
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void drink() {
        System.out.println("喝水");
    }

    //重写接口抽象方法
    @Override
    public void swim() {
        System.out.println("狗会狗刨游泳");
    }
}
