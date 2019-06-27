package part_01.Mar08.demo05;

public class Worker {
    private String name;
    private String workNum;
    private int salary;

    Worker() {
    }

    Worker(String name, String workNum, int salary) {
        this.name = name;
        this.workNum = workNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //父类方法
    public void work() {
        System.out.println("父类的work方法");
    }
}
