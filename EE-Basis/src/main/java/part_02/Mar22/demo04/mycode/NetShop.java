package part_02.Mar22.demo04.mycode;
@SuppressWarnings("all")
//官网Runnable实现类
public class NetShop implements Runnable {
    //创建Fruit对象
    public Fruit fruit;

    //在创建官网Runnable实现类是传入公共对象fruit，公共对象中包含共享信息
    public NetShop(Fruit fruit) {
        this.fruit = fruit;
    }

    //重写Runnable接口的run方法
    @Override
    public void run() {
        //永真循环
        while (true) {
            //fruit作为锁对象
            synchronized (fruit) {
                //当所对象中的共享信息stock大于0时
                if (fruit.getStock() > 0) {
                    //输出信息并且做相应的操作
                    System.out.println("官网正在卖出第" + (100 - fruit.getStock() + 1) +
                            "份，还剩余" + (fruit.getStock() - 1) + "份");
                    fruit.setStock(fruit.getStock() - 1);
                    //调用wait方法进入waitting状态，等待被唤醒
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
