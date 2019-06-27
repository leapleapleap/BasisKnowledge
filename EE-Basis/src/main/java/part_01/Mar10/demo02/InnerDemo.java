package part_01.Mar10.demo02;
/*
    测试类
 */
public class InnerDemo {
    public static void main(String[] args) {
        //Outer.Inner oi = new Outer().new Inner();
        //oi.show();

        Outer o = new Outer();
        //通过调用外部类的内部类访问方法来间接调用内部类
        o.innerShow();

        o.innerShow("风清扬",33);
    }
}
