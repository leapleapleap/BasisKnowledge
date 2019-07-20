package part_02.Mar20.demo11;

public class SellTicket {
    public static void main(String[] args) {

        MyRunnableImpl mt = new MyRunnableImpl();
        Thread t1 = new Thread(mt,"售票窗口一");
        Thread t2 = new Thread(mt,"售票窗口二");
        Thread t3 = new Thread(mt,"售票窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
