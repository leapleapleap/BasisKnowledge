package part_01.Mar13.demo03;

import java.util.Calendar;

public class Demo01 {
    public static void main(String[] args) {
        //public static Calendar getInstance()：获得Calendar实例
        Calendar c = Calendar.getInstance();

        /*  public abstract void add(int field, int amount)
                    //根据日历的规则，将指定的时间量添加或减去给定的日历字段
            public void set(int field, int value)
                    //将给定的日历字段设置为给定的值  */

        //c.add(Calendar.YEAR,-3);     //2016年6月27日
        //c.set(2023,11,11);  //2023年12月11日

        //public static final int YEAR = 1
        int y = c.get(Calendar.YEAR);
        //public static final int MONTH = 2
        int m = c.get(Calendar.MONTH) + 1;
        //public static final int DAY_OF_MONTH = 5
        int d = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(y + "年" + m + "月" + d + "日");

    }
}
