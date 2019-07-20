package part_02.Mar22.demo04.mycode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        //创建公共对象
        Fruit fruit = new Fruit();
        //调用Executors类的
        //public static ExecutorService newFixedThreadPool(int nThreads)
        ExecutorService service = Executors.newFixedThreadPool(2);
        //调用submit方法将Runnable实现类对象传递给线程池执行相应的run方法
        service.submit(new NetShop(fruit));
        service.submit(new FrontShop(fruit));
        //new Thread(new NetShop(fruit),"官网").start();
        //new Thread(new FrontShop(fruit),"实体店").start();
    }
}
