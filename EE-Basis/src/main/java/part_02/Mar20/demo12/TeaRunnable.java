package part_02.Mar20.demo12;

public class TeaRunnable implements Runnable {
    //定义一个变量，用来记录包包的总数
    private int bags = 100;

    @Override
    public void run() {
        //定义变量，记录当前线程卖了多少个包包
        int count = 0;
        while (true) {
            //this是指Runnable实现类的对象
            synchronized (this) {
                if (bags > 0) {
                    //还有包包，继续卖
                    bags--;
                    System.out.println(Thread.currentThread().getName() + "卖出第" + (100 - bags) + "个包包");
                    count++;
                } else {
                    //没有包包了，不需要卖了，统计出总共卖了多少个包包，并打印到控制台
                    System.out.println(Thread.currentThread().getName() + "总共卖出了" + count + "个包包");
                    break;
                }
            }
        }
    }
}
