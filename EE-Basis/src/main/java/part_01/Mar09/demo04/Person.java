package part_01.Mar09.demo04;
//超类
public abstract class Person {
    //私有化成员变量
    private String name;
    private int age;

    //无参构造器
    public Person() {
    }

    //带参构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter&Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //抽象方法
    public abstract void eat();
}
