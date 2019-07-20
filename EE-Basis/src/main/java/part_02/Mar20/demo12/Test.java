package part_02.Mar20.demo12;


public class Test {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        new Thread(runnable,"实体店").start();
        new Thread(runnable,"官网").start();

        /*TeaRunnable teaRunnable = new TeaRunnable();
        new Thread(teaRunnable,"实体店").start();
        new Thread(teaRunnable,"官网").start();*/

    }
}
