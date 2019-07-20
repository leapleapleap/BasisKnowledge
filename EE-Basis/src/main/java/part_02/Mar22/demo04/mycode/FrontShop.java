package part_02.Mar22.demo04.mycode;
@SuppressWarnings("all")
//实体店Runnable实现类
public class FrontShop implements Runnable {
    //创建Fruit对象
    public Fruit fruit;

    //在创建实体店Runnable实现类是传入公共对象fruit，公共对象中包含共享信息
    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
    }

    //重写Runnable接口的run方法
    @Override
    public void run() {
        //永真循环
        while (true) {
            //先睡眠0.2秒，以保证官网线程首先抢到锁并执行run方法
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (fruit) {
                //当所对象中的共享信息stock大于0时
                if (fruit.getStock() > 0) {
                    //输出信息并且做相应的操作
                    System.out.println("实体店正在卖出第" + (100 - fruit.getStock() + 1) +
                            "份，还剩余" + (fruit.getStock() - 1) + "份");
                    fruit.setStock(fruit.getStock() - 1);
                    //唤醒官网线程继续执行
                    fruit.notify();
                }
            }
        }
    }
}
