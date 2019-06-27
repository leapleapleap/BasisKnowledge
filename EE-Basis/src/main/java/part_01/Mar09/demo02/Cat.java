package part_01.Mar09.demo02;

/*
    Cat类实现CatInterface接口
 */
public class Cat implements CatInterface {

    //重写CatInterface接口的抽象方法
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }

    @Override
    public void catchFish() {
        System.out.println("猫可以捉鱼了");
    }

    @Override
    public void speak() {
        System.out.println("喵喵叫");
    }
}
