package part_06.April26_cookie.cookie;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
    public String getTime() throws UnsupportedEncodingException {
        //获取时间
        Date date = new Date();
        //定义时间格式
        String format = "yyyy年MM月dd日 HH:mm:ss";
        //创建时间格式工具并传入时间格式
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //获取字符串格式的日期时间
        String time = sdf.format(date);
        //将字符串使用UTF-8编码并返回
        return URLEncoder.encode(time,"utf-8");
    }
}
