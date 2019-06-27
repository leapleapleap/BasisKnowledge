package part_01.Mar09.demo06;

public class Frog extends Animal implements Swimming {

    public Frog() {
    }

    public Frog(int age) {
        super(age);
    }

    //重写父类抽象方法
    @Override
    public void eat() {
        System.out.println("青蛙吃小虫");
    }
    @Override
    public void drink() {
        System.out.println("喝水");
    }

    //重写接口抽象方法
    @Override
    public void swim() {
        System.out.println("青蛙会蛙泳");
    }
}
