package part_02.Mar22.demo04.teacher_code;

@SuppressWarnings("all")
public class NetShop implements Runnable {
    //创建Fruit对象
    Fruit fruit = new Fruit();
    //记录水果的总数
    private int total;
    //定义构造方法传递公共对象
    public NetShop(Fruit fruit) {
        this.fruit = fruit;
        total = fruit.getStock();
    }
    //重写Runnable接口的Run方法
    @Override
    public void run() {
        //永真循环
        while (true) {
            //同步代码块
            synchronized (fruit) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //如果水果的库存大于0
                if (fruit.getStock() > 0) {
                    //获得水果的库存
                    int stock = fruit.getStock();
                    //库存减一
                    stock--;
                    //修改水果的库存
                    fruit.setStock(stock);
                    //给控制台输出相应的信息
                    System.out.println(/*Thread.currentThread().getName()*/"官网正在卖出第" +
                            (total - stock) + "份，还剩余" + stock + "份");
                    //唤醒另外一个线程
                    fruit.notify();
                    //此线程进入睡眠状态
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //如果水果的库存不大于0即等于或者小于0时
                } else {
                    //唤醒另外一个线程，以防另外一个线程永远沉睡
                    fruit.notify();
                    //跳出循环结束线程
                    break;
                }
            }
        }
    }
}
