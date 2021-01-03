package part_06.April26_cookie.download.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * 解决中文下载文件名在浏览器上显示乱码的工具类
 * 原理：根据request对象请求头user_agent的值判断客户端浏览器类型，
 *      不同的类型对文件名做不同的处理。
 */
public class DownLoadUtils {
    public static String getFileName(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")) {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        } else if (agent.contains("Firefox")) {
            // 火狐浏览器
            filename = "=?utf-8?B?" + Base64.getEncoder().encode(filename.getBytes("utf-8")) + "?=";
        } else {
            // 其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}
