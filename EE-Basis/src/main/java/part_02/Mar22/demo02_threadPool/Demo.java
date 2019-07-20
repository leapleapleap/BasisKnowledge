package part_02.Mar22.demo02_threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        //线程池的操作
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new BaoZiPu(bz));
        service.submit(new ChiHuo(bz));

    }


}
