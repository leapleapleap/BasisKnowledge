package part_01.Mar08.demo02;

class Dog extends Animal {
    Dog() {
    }

    Dog(String name, int age) {
        super(name, age);
    }

    void beat(){
        System.out.println("小狗嗵嗵嗵");
    }

    //子类特有方法
    void lookDoor() {
        System.out.println("狗看门");
    }
}
