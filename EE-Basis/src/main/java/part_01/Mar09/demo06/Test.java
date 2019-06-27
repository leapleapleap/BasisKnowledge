package part_01.Mar09.demo06;

public class Test {
    public static void main(String[] args) {
        Feeder feeder = new Feeder();

        Dog dog = new Dog(5);
        feeder.feeding(dog);
        System.out.println();

        Frog frog = new Frog(1);
        feeder.feeding(frog);
        System.out.println();

        Sheep sheep = new Sheep(2);
        feeder.feeding(sheep);
    }
}
