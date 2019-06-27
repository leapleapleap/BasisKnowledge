package part_01.Mar13.demo05;

/*      在类加载阶段先加载并初始化静态代码块的代码，之后
    再执行构造代码块内的代码，最后再执行构造器构造对象
    注意:代码块的位置不影响其执行的先后顺序   */

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(1);

    }
}
