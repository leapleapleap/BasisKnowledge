package part_03.Mar29.demo05;

public class Demo {
    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类作为函数式接口传入参数");
            }
        });

        show(()->{
            System.out.println("使用Lambda表达式作为函数式接口传入参数");
        });

        show(()->System.out.println("使用Lambda表达式作为函数式接口传入参数"));

        MyFunctionalInterface.staticMethod();

    }

    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
}
