package part_01.Mar09.demo04;

public class Athlete_Basketball extends Athlete {

    public Athlete_Basketball() {
    }

    public Athlete_Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃汉堡喝可乐");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}
