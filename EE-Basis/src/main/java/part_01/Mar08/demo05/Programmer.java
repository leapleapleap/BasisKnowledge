package part_01.Mar08.demo05;

public class Programmer extends Worker {
    public Programmer() {
    }

    public Programmer(String name, String workNum, int salary) {
        super(name, workNum, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员在工作");
    }
}
