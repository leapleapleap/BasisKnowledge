package part_01.Mar13.demo02;

import java.text.ParseException;
import java.util.Date;

public class Demo02_DateDemo {
    public static void main(String[] args) throws ParseException {

        Date d = new Date();

        //格式化可以将Date对象以任意日期\时间格式转换成字符串
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(d, "HH时mm分ss秒");
        System.out.println(s2);
        String s3 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s3);
        String s4 = DateUtils.dateToString(d, "yyyy年MM月 HH:mm:ss");
        System.out.println(s4);

        String s5 = "1993年10月03日 12时12分12秒";
        Date d1 = DateUtils.stringToDate(s5, "yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(d1);

        //System.out.println(DateUtils.stringToDate(s1, "yyyy-MM-dd HH:mm:ss"));
        //解析时传入的字符串要与日期\时间格式相匹配，否则将会报错--ParseException: Unparseable

        String s6 = "1993-10-03 11:11:11";
        Date d2 = DateUtils.stringToDate(s6, "yyyy-MM-dd HH:mm:ss");
        System.out.println(d2);

        //date ： the milliseconds since January 1, 1970, 00:00:00 GMT
        Date dd = new Date(1000);
        System.out.println(dd);

    }
}
