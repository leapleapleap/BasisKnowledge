package part_01.Mar10.demo01;

public class Outer {
    //成员方法
    private int num = 10;

    //成员内部类
    private class Inner{
        //内部类方法
        public void show(){
            //成员内部类可访问外部类的所有字段及方法
            System.out.println(num);
        }
    }

    //私有内部类的访问方法
    public void InnerShow(){
        //访问内部类需要创建内部类对象，用对象调用内部类成员变量和方法
        Inner i = new Inner();
        i.show();
    }
}
