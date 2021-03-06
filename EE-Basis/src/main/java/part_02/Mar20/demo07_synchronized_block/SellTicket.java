package part_02.Mar20.demo07_synchronized_block;


/*  模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售  */
@SuppressWarnings("all")
public class SellTicket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run,"窗口1");
        Thread t1 = new Thread(run,"窗口2");
        Thread t2 = new Thread(run,"窗口3");
        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}

