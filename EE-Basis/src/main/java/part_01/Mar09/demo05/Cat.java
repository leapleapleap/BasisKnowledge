package part_01.Mar09.demo05;
/*
    定义猫类继承动物类
		行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }

    //子类特有方法
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
