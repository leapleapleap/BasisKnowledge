package part_01.Mar14.demo02;

//泛型类
public class GenericClass<E> {

    //泛型属性
    private E name;

    public GenericClass() {
    }

    public GenericClass(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
