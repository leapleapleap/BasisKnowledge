package part_02.Mar20.demo11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnableImpl implements Runnable {
    //成员变量/共享资源
    private int ticket = 100;
    //锁对象
    static Object obj = new Object();

    //同步代码块
    /*@Override
    public void run() {
        //线程执行代码

        //死循环
        while (true) {
            //同步代码块
            synchronized (obj) {
                if (ticket >= 1) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "窗口售出门票，还剩" + --ticket + "张票");
                }
            }
            //判断电源票剩余量，若无余票则输出信息并跳出死循环
            if (ticket == 0) {
                System.out.println(Thread.currentThread().getName()+"号窗口售罄");
                return;
            }
        }
    }*/


    /*@Override
    public void run() {
        while (true) {
            //调用同步方法
            getTicket();
            //判断电源票剩余量，若无余票则输出信息并跳出死循环
            if (ticket == 0) {
                System.out.println(Thread.currentThread().getName() + "号窗口售罄");
                return;
            }
        }
    }
    //同步方法
    public synchronized void getTicket() {
        //判断条件
        if (ticket >= 1) {
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //输出售票信息
            System.out.println(Thread.currentThread().getName() + "窗口售出门票，还剩" + --ticket + "张票");
        }
    }*/

    //lock锁
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //同步代码块
            l.lock();
            if (ticket >= 1) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "窗口售出门票，还剩" + --ticket + "张票");
            }
            l.unlock();

            //判断电源票剩余量，若无余票则输出信息并跳出死循环
            if (ticket == 0) {
                System.out.println(Thread.currentThread().getName() + "号窗口售罄");
                return;
            }
        }
    }

}
