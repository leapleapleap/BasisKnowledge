package part_01.Mar13.demo03;


import java.util.Calendar;

/*  用程序判断2019年2月14日是星期几 */

public class Demo03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2019,1,14);
        //国际上是以星期日为一周第一天的开始，Calendar中提供的DAY_OF_WEEK
        //获取的一周也是以星期日作为一周的开始
        int i = c.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(i);
    }
}
