package part_01.Mar08.demo02;

class Cat extends Animal {
    Cat() {
    }

    Cat(String name, int age) {
        super(name, age);
    }

    void beat(){
        System.out.println("小猫咪咪咪");
    }

    //子类特有方法
    void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}
