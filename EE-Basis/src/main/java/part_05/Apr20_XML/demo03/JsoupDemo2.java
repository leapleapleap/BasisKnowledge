package part_05.Apr20_XML.demo03;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup对象功能
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //2.1获取student.xml的path
        String path = JsoupDemo2.class.getClassLoader().getResource("Web_Time//_0420_XML//student.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);

       //2.parse​(String html)：解析xml或html字符串
       /* String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t\t<name>tom</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name>jack</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "</students>";
        Document document = Jsoup.parse(str);
        System.out.println(document);*/

        //3.parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        /*
        URL url = new URL("https://baike.baidu.com/item/%E7%AC%AC%E4%BA%8C%E5%B1%8A%E4%B8%AD%E5%9B%BD%E5%9B%BD%E9%99%85%E8%BF%9B%E5%8F%A3%E5%8D%9A%E8%A7%88%E4%BC%9A");//代表网络中的一个资源路径
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);
        */

    }

}
