package part_03.Apr01.demo05;

import java.util.Date;

/*  JDK中预定义的一些注解
  		* @Override	：检测被该注解标注的方法是否是继承自父类(接口)的
  		* @Deprecated：该注解标注的内容，表示已过时
  		* @SuppressWarnings：压制警告
  		* @FunctionalInterface：检测是否是函数式接口   */
@SuppressWarnings("all")
public class AnnoDemo {
    //检测被该注解标注的方法是否是继承自父类(接口)的
    @Override
    public String toString() {
        return super.toString();
    }

    //该注解标注的内容，表示已过时
    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1方法
    }

    public void demo(){
        //在调用show1方法是会在方法名上出现一道横线，这表示该方法已被弃用
        //不建议使用但是仍然可以使用
        //这就是Deprecated注意的作用
        show1();
        //date类中有很多已经弃用的方法，这些方法现在已有Calender类的方法替代
        Date date = new Date();
    }
}
