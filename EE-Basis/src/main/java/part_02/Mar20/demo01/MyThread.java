package part_02.Mar20.demo01;

/*  获取线程的名称:
        1.使用Thread类中的方法getName()
            String getName() 返回该线程的名称。
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用 */
public class MyThread extends Thread{
    @Override
    public void run() {
        //获取线程名称
        //String name = getName();

        //获得当前线程
        //Thread t = Thread.currentThread();

        //System.out.println(t);    //Thread[Thread-0,5,main]

        //Thread类重写了Objects类的toString()方法
        /*  public String toString() {
                ThreadGroup group = getThreadGroup();
                if (group != null) {
                    return "Thread[" + getName() + "," + getPriority() + "," +
                                   group.getName() + "]";
                } else {
                    return "Thread[" + getName() + "," + getPriority() + "," +
                                    "" + "]";
                }
            }   */

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}

