package part_01.Mar14.demo03;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method1(100);
        gm.method1("哈哈");
        gm.method1(8.8);
        gm.method1(true);

        GenericMethod.method2("哇哇哇哈哈哈");
        GenericMethod.method2(false);
    }
}
