package part_01.Mar09.demo01;

//有继承关系
public class Cat extends Animal {
    public int age = 20;
    public int weight = 10;

    //方法重写
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void playGame(){
        System.out.println("猫捉老鼠");
    }
}
