package part_01.Mar09.demo02;

//接口继承接口可以多继承
public interface CatInterface extends CatchFish, Jumpping {
    //接口中的抽象方法默认的修饰符为public abstract
    void speak();
}
