package part_02.Mar20.demo04;

/*  创建多线程程序的第二种方式:实现Runnable接口
    java.lang.Runnable
        Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。该类必须定义一个称为 run 的无参数方法。
    java.lang.Thread类的构造方法
        Thread(Runnable target) 分配新的 Thread 对象。
        Thread(Runnable target, String name) 分配名为name的新 Thread 对象。

    实现步骤:
        1.创建一个Runnable接口的实现类
        2.在实现类中重写Runnable接口的run方法,设置线程任务
        3.创建一个Runnable接口的实现类对象
        4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        5.调用Thread类中的start方法,开启新的线程执行run方法

    实现Runnable接口创建多线程程序的好处:
        1.避免了单继承的局限性
            一个类只能继承一个类(一个人只能有一个亲爹),类继承了Thread类就不能继承其他的类
            实现了Runnable接口,还可以继承其他的类,实现其他的接口
        2.增强了程序的扩展性,降低了程序的耦合性(解耦)
            实现Runnable接口的方式,把设置线程任务和开启新线程进行了分离(解耦)
                Runnable实现类中,重写了run方法:用来设置线程任务
                创建Thread类对象,调用start方法:用来开启新线程   */
@SuppressWarnings("all")
public class RunnableDemo {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        //主线程
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }


        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("哈哈哈");
            }
        };
        t1.start();


        new Thread(){
            @Override
            public void run() {
                System.out.println("第一种方法的匿名内部类方法实现线程开启");
            }
        }.start();


        //接收由匿名内部类创建的Runnable()的实现类对象
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        };
        new Thread(runnable,"小强").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        },"旺财").start();


        new Thread(/*run*/()-> System.out.println("Lambda"),"阿刁").start();
    }
}
