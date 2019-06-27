package part_01.Mar08.demo02;

/*  Animal类
    Cat类、Dog类   */
public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(3);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.catchMouse();
        cat.beat();

        System.out.println("======");

        Dog dog = new Dog("狮子狗", 1);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.lookDoor();
        dog.beat();
    }
}
