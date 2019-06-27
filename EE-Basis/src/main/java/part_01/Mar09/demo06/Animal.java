package part_01.Mar09.demo06;

public abstract class Animal {
    private int age;

    //抽象方法
    public abstract void eat();

    public abstract void drink();

    //无参构造器
    public Animal() {
    }

    //带参构造器
    public Animal(int age) {
        this.age = age;
    }

    //Getter & Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
