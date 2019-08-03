package part_03.Mar29.demo05;

/*  函数式接口中只能有且只有一个抽象方法，但是可以有其他类型的方法
    包括：
        默认方法:
            解决了接口升级的问题
            在接口中定义默认方法,实现类中可以重写这个方法,也可以不重写,若不重写则调用的是接口中的默认实现
        静态方法:
            接口中的静态方法属于接口,不能被实现类重写！独立接口的使用,不再受实现类的束缚!
        私有方法:
            在接口内进行代码的封装,提高代码的复用性,并且不把对应的方法暴露给外界 */
@FunctionalInterface
public interface MyFunctionalInterface {
    //抽象方法
    void method();
    //私有方法
    private void privateMethod(){
        System.out.println("私有方法");
    }
    //静态方法
    public static void staticMethod(){
        System.out.println("静态方法");
    }
    //默认方法
    public default void usePrivateMethod(){
        privateMethod();
    }
}
/*


 */