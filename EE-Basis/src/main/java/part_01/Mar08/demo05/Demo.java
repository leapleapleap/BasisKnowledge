package part_01.Mar08.demo05;

public class Demo {
    public static void main(String[] args) {

        Manager m = new Manager("吴经理", "10023", 15000, 3000);
        m.work();

        Programmer p = new Programmer("小马", "10213", 12000);
        p.work();

    }
}
