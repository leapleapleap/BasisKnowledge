package part_01.Mar14.demo04;

//泛型接口的实现方法二：不指定泛型接口的数据类型，待构造对象时根据传入参数类型确定
public class GenericInterfaceImpl02<E> implements GenericInterface <E> {
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
