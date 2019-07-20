package part_01.Mar17.demo06.default_method;

public interface Human {
    //抽象方法
    public abstract void eat();

    //默认方法
    public default void drink(){
        System.out.println("喝水~~~");
    }
}
