package part_01.Mar14.demo04;

//泛型接口的实现方法一：指定接口泛型的实际类型
public class GenericInterfaceImpl01 implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
