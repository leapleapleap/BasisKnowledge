package part_02.Mar20.demo12;


public class MyRunnable implements Runnable {
    private static int num = 100;
    //同步锁对象
    Object obj = new Object();

    @Override
    public void run() {
        int count = 0;
        while(true) {
            synchronized (obj){
                if(num>0){
                    count++;
                    num--;
                    System.out.println(Thread.currentThread().getName()+"卖出产品");
                    /*try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                } else {
                    break;
                }
            }
        }

        if (Thread.currentThread().getName().equals("实体店")){
            System.out.println("实体店共卖出"+count+"个包");
        }else if (Thread.currentThread().getName().equals("官网")){
            System.out.println("网络店共卖出"+count+"个包");
        }
    }
}

/*public class MyRunnable implements Runnable {
    private int packages = 100;
    Object object = new Object();

    int count = 0;
    int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (packages > 0) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (Thread.currentThread().getName().equals("实体店")) {
                        count++;
                    } else {
                        num++;
                    }
                    //System.out.println(Thread.currentThread().getName() + "===" + packages--);
                    packages--;
                    if (packages == 0) {
                        System.out.println("实体店共卖出了" + count + "个");
                        System.out.println("官网共卖出了" + num + "个");
                        break;
                    }
                }
            }
        }
    }
}*/
