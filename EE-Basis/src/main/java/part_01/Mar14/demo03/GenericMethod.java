package part_01.Mar14.demo03;

public class GenericMethod {
    //泛型方法
    public <M> void method1(M m){
        System.out.println(m);
    }

    //泛型静态方法
    public static <S> void method2(S s){
        System.out.println(s);
    }
}
