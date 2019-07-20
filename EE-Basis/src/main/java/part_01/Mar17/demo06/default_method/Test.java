package part_01.Mar17.demo06.default_method;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Worker w = new Worker();

        stu.eat();
        stu.drink();
        w.eat();
        w.drink();
    }
}
