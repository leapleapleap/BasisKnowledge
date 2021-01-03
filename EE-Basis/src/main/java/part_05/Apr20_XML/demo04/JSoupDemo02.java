package part_05.Apr20_XML.demo04;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
    JSoup解析器（HTML/XML）的简单实用
 */
public class JSoupDemo02 {
    public static void main(String[] args) throws IOException {
        //获取xml文档的路径字符串,类加载器获取的路径是src文件夹下的文件及其文件夹下的子文件
        String path = JSoupDemo02.class.getClassLoader().getResource("Web_Time/_0420_XML/student.xml").getPath();
        //实用Jsoup的静态方法parse解析xml，获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "UTF-8");

        Elements elements = document.getElementsByTag("name");
        System.out.println(elements);
        System.out.println("-------");

        Element student_1 = document.getElementsByTag("student").get(0);
        String numBer = student_1.attr("numBer");
        System.out.println(numBer);
        System.out.println("--===--");

        String text = student_1.text();
        System.out.println(text);
        System.out.println("-------");

        String html = student_1.html();
        System.out.println(html);
        System.out.println("-------------");

        Elements names = document.select("name");
        System.out.println(names);
        System.out.println("-------");

        Elements ele_stu = document.select("student[number='heima_0001']");
        System.out.println(ele_stu);
        System.out.println("-------");

        Elements ele_stu_age = document.select("student[number='heima_0001'] > age");
        System.out.println(ele_stu_age);
        System.out.println("-------");
    }
}
