package part_01.Mar13.demo04;
/*  在类加载阶段先加载父类后加载子类，所以先执行父类的静态
    代码块后执行子类的静态代码块，之后在创建对象时先执行父
    类构造器，后执行子类构造器   */

public class Human_Teacher_Test {
    public static void main(String[] args) {
        //创建老师对象
        Teacher t = new Teacher();
    }
}
