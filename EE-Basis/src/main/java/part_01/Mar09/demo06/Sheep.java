package part_01.Mar09.demo06;

public class Sheep extends Animal {

    public Sheep() {
    }

    public Sheep(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("羊啃草");
    }

    @Override
    public void drink() {
        System.out.println("喝水");
    }
}
