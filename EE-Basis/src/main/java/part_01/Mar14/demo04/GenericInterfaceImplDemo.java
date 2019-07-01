package part_01.Mar14.demo04;

public class GenericInterfaceImplDemo {
    public static void main(String[] args) {
        GenericInterfaceImpl01 gi1 = new GenericInterfaceImpl01();
        gi1.method("吃饭饭");

        GenericInterfaceImpl02<Integer> gi2 = new GenericInterfaceImpl02<>();
        gi2.method(12);
    }
}
