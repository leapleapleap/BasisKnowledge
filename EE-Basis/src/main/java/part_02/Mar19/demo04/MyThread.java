package part_02.Mar19.demo04;

//1.创建一个Thread类的子类
public class MyThread extends Thread {
    //2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.println("myThread:" + i);
        }
    }
}
