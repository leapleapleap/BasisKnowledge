package part_05.Apr20_XML.demo04;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.util.List;

/*
    JSoup解析器（HTML/XML）的简单实用
    / ：   从根目录开始查询
    //：   在整个文档中查询，不考虑位置关系
 */
public class JSoupDemo03 {
    public static void main(String[] args) throws Exception {
        //获取xml文档的路径字符串,类加载器获取的路径是src文件夹下的文件及其文件夹下的子文件
        String path = JSoupDemo03.class.getClassLoader().getResource("Web_Time/_0420_XML/student.xml").getPath();
        //实用Jsoup的静态方法parse解析xml，获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "UTF-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//students/student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        JXNode jxNode = jxDocument.selNOne("//students/student[@number='heima_0001']");
        System.out.println(jxNode);
        List<JXNode> jxNodes1 = jxDocument.selN("//students/student[@number^='heima']");
        for (JXNode node : jxNodes1) {
            System.out.println(node);
        }

        JXNode jxNode1 = jxDocument.selNOne("//students/student[@number$='1']");
        System.out.println(jxNode1);
    }
}
