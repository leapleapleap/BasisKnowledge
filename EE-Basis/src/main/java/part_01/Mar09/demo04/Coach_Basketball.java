package part_01.Mar09.demo04;

public class Coach_Basketball extends Coach {

    public Coach_Basketball() {
    }

    public Coach_Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃汉堡喝可乐");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教授篮球技巧");
    }
}
