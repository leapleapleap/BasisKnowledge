package part_01.Mar08.demo02;

//抽象类
abstract class Animal {
    private String name;
    private int age;

    Animal() {
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    //抽象方法
    abstract void beat();
}
