package part_02.Mar22.demo02_threadPool;

@SuppressWarnings("all")
public class ChiHuo implements Runnable {
    public BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //使用死循环,让吃货一直吃包子
        while (true) {
            //必须同时同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
                //对包子的状态进行判断
                if (bz.flag == false) {
                    //吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行的代码,吃包子
                System.out.println("吃货正在吃:" + bz.pi + bz.xian + "的包子");
                //吃货吃完包子
                //修改包子的状态为false没有
                bz.flag = false;
                bz.notify();
                //吃货唤醒包子铺线程,生产包子
                System.out.println("吃货已经把:" + bz.pi + bz.xian + "的包子吃完了,包子铺开始生产包子");
                System.out.println("------------------------------------");
            }
        }
    }
}
