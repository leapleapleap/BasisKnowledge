package part_02.Mar22.demo04.teacher_code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {

        Fruit fruit = new Fruit(100);

        ExecutorService service = Executors.newFixedThreadPool(2);
        //线程池在执行完传入的线程任务之后不会关闭线程池，也就是说在程序执行完之后还会一直处于运行状态
        service.submit(new NetShop(fruit));
        service.submit(new FrontShop(fruit));
        //如果想要在线程池执行完传入的Runnable接口实现类对象后程序自动停止，则需调用ExecutorService类的shutDown方法
        service.shutdown();

    }
}
