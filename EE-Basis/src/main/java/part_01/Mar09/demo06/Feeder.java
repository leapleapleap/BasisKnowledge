package part_01.Mar09.demo06;

@SuppressWarnings("all")
public class Feeder {
    //多态------>  父类类名  标识符 = new 子类类名
    public void feeding(Animal a) {
        //无属性，使用系统提供无参构造器

        //判断并分情况调用各自类的方法
        a.eat();
        a.drink();
        if (a instanceof Swimming) {
            Swimming s = (Swimming) a;
            s.swim();
        }
    }
}
