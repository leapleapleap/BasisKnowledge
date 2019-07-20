package part_02.Mar22.demo04.teacher_code;

@SuppressWarnings("all")
public class FrontShop implements Runnable {
    Fruit fruit = new Fruit();
    private int total;
    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
        total = fruit.getStock();
    }
    @Override
    public void run() {
        while (true) {
            synchronized (fruit) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (fruit.getStock() > 0) {
                    int stock = fruit.getStock();
                    stock--;
                    fruit.setStock(stock);
                    System.out.println(/*Thread.currentThread().getName()*/"实体店正在卖出第" +
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
