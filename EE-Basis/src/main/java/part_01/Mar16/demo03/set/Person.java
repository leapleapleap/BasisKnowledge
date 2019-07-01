package part_01.Mar16.demo03.set;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    //无参构造方法
    public Person() {
    }

    //带参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    //重写hasCode方法
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Demo02_person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Getter & Setter
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
}
