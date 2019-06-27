package part_01.Mar09.demo01;

/*  多态的前提：
        要有继承或实现关系
        要有方法的重写
        要有父类/接口引用指向子类/实现类对象

    成员变量：   编译看左边，运行看左边；
    成员方法：   编译看左边，运行看右边。    */
public class AnimalDemo {
    public static void main(String[] args) {
        //子类对象赋给父类引用(或者可以说成是父类引用指向子类对象)
        Animal a = new Cat();
        //成员变量编译看左边，执行任然看左边
        System.out.println(a.age);//40

        //成员方法编译看左，执行看右
        a.eat();    //猫吃鱼
        //子类新增的方法不能用父类对象调用
        //a.playGame();
        //若要调用子类属性/特有方法，则要把父类对象向下转型
        Cat c = (Cat) a;
        System.out.println(c.age);//20
        System.out.println(c.weight);//10
        c.playGame();//猫捉老鼠
    }
}
