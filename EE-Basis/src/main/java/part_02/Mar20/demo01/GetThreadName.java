package part_02.Mar20.demo01;

/*  线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2 */
public class GetThreadName {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread()); //获取主线程对象   Thread[main,5,main]
        System.out.println(Thread.currentThread().getName());   //获取主线程名称   main
    }
}

