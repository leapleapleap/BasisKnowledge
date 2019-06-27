package part_01.Mar09.demo04;

public abstract class Athlete extends Person {
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    //运动员接口的抽象方法
    public abstract void study();
}
