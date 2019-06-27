package part_01.Mar08.demo01;

/*  Fu类
    Zi类     */

public class Demo {
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi("张三");
        /*  父类无参构造器
            子类无参构造器
            父类无参构造器
            子类带参构造器 */
        z1.show();
        /*  父类的成员变量age：40
            本类的成员变量age：20
            本类的局部变量age：30
            175     */
        z1.eat(); // 父类成员方法eat()
    }
}
