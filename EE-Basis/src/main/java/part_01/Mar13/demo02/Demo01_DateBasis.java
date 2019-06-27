package part_01.Mar13.demo02;

import java.util.Date;

public class Demo01_DateBasis {
    public static void main(String[] args) {

        /*  public Date() {
                this(System.currentTimeMillis());
        }  */
        Date d1 = new Date();
        System.out.println(d1);   //返回当前时间

        long l = 1000*60*60L;       //1小时
        //相对于1970-1-1 00:00:00的偏移毫秒值
        Date d2 = new Date(l);  //Thu Jan 01 09:00:00 CST 1970
        //中国位于世界时区的东八区，所以不是01:00:00,而是09:00:00
        System.out.println(d2);
        //Thu Jan 01 09:00:00 CST 1970

        //获取系统当前时间
        long sc = System.currentTimeMillis();
        //public long getTime()
        //获取系统当前时间
        long dg = new Date().getTime();
        System.out.println("sc:"+sc);  //sc:1557395847280
        System.out.println("dg:"+dg);  //dg:1557395847280

        //设置系统时间,传入一个long数值代表毫秒值
        d2.setTime(1000*60*60*4);
        System.out.println(d2);   //Thu Jan 01 12:00:00 CST 1970

        //以下方法已过时
        /*  System.out.println("年份："+d1.getYear()+",月份："+d1.getMonth()+"，日期："+
                d1.getDay()+"，小时："+d1.getHours()+"，分钟"+d1.getMinutes());  */
    }
}
