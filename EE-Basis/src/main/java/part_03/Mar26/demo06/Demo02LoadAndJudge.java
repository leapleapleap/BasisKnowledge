package part_03.Mar26.demo06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo02LoadAndJudge {
    public static void main(String[] args) throws IOException {
        Properties pr = new Properties();
        FileReader fr = new FileReader("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\1.txt");
        pr.load(fr);
        Set<Object> objects = pr.keySet();
        for (int i = 1; i <= 3; i++) {
            for (Object object : objects) {
                if(((String)object).equals(Integer.toString(i))){
                    FileWriter fw = new FileWriter("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\1.txt");
                    System.out.println(pr.getProperty((String)object));
                    pr.remove(object);
                    pr.store(fw,"");
                    fw.close();
                    return;
                }
            }
        }
        System.out.println(pr.getProperty("4"));
        fr.close();
    }
}
