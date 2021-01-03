package part_05.Apr20_XML.demo04;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
    JSoup解析器（HTML/XML）的简单实用
 */
public class JSoupDemo01 {
    public static void main(String[] args) throws IOException {
        //获取xml文档的路径字符串,类加载器获取的路径是src文件夹下的文件及其文件夹下的子文件
        String path = JSoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //实用Jsoup的静态方法parse解析xml，获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //获取dom树中的标签名为name的元素集合，生成的Elements类对象，该Elements类是继承自ArrayList集合
        Elements names = document.getElementsByTag("name");
        //由于有继承关系，所以能够使用ArrayList集合中的get方法根据索引获取对象中的某一个元素
        //再调用text方法获取文本内容
        String name = names.get(0).text();
        //输出文本内容
        System.out.println(name);
    }
}
