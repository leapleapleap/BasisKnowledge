package part_02.Mar22.demo03_functional_interface;

public class CalculatorDemo {
    public static void main(String[] args) {
        //使用匿名内部类传递实现类
        invokeCal(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        //使用lambda表达式传递变量
        invokeCal(120, 130, (int a, int b) -> {
            return a + b;
        });
        //lambda表达式优化
        invokeCal(120, 130, (a, b) -> a + b);
    }

    //静态方法
    public static int invokeCal(int a, int b, Calculator c) {
        return c.calc(a, b);
    }
}
