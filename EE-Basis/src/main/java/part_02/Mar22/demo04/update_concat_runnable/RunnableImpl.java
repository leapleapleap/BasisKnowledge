package part_02.Mar22.demo04.update_concat_runnable;
@SuppressWarnings("all")
public class RunnableImpl implements Runnable{
    //创建fruit对象
    Fruit fruit = new Fruit();
    //私有total属性，接收水果总量
    private int total;
    //带参构造方法，用于接收公共对象
    public RunnableImpl(Fruit fruit) {
        this.fruit = fruit;
        total = fruit.getStock();
    }
    @Override
    public void run() {
        while (true) {
            synchronized (fruit) {
                if (fruit.getStock() > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int stock = fruit.getStock();
                    stock--;
                    fruit.setStock(stock);
                    System.out.println(Thread.currentThread().getName() + "正在卖出第" +
                            (total - stock) + "份，还剩余" + stock + "份");
                    fruit.notify();
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    fruit.notify();
                    break;
                }
            }
        }
    }
}
