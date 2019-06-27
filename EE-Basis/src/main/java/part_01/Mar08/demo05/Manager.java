package part_01.Mar08.demo05;

public class Manager extends Worker {
    private int bonus;

    public Manager() {
    }

    public Manager(String name, String workNum, int salary, int bonus) {
        super(name, workNum, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理在工作");
    }
}
