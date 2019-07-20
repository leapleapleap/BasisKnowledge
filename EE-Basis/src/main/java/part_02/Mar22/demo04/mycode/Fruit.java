package part_02.Mar22.demo04.mycode;
@SuppressWarnings("all")
public class Fruit {
    //定义成员变量，作为共享信息
    private int stock = 100;

    //无参构造方法
    public Fruit() {
    }

    //带参构造方法
    public Fruit(int stock) {
        this.stock = stock;
    }

    //Getter & Setter
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
