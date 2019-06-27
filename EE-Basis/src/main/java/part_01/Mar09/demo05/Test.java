package part_01.Mar09.demo05;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("黄药师");
        p.setAge(66);

        Dog d = new Dog();
        d.setColor("黄色");
        d.setAge(3);
        p.keepPet(d, "骨头");

        Cat c = new Cat();
        c.setColor("黑色");
        c.setAge(3);
        p.keepPet(c, "小鱼");
    }
}
