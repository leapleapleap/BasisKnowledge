package part_01.Mar13.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("all")
public class DateUtils {
    private DateUtils() {
    }
    /*  工具方法----格式化Date实例
            public final String format(Date date)
            参数：Date实例，String 时间格式
            返回值类型：String    */
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
    /*   工具方法----解析String字符串
            public Date parse(String dateStr) throws ParseException
            参数：String 字符串，String 时间格式
            返回值类型：Date  */
    public static Date stringToDate(String dateStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateStr);
    }
    /*  public static Date stringToDate(String s, String format) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date parse = new Date();
            try {
                parse = sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse;
        }  */
}
