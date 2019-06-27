package part_01.Mar09.demo04;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    //教练接口的抽象方法
    public abstract void teach();
}
