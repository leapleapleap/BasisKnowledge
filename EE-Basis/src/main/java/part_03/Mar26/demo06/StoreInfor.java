package part_03.Mar26.demo06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    1.使用properties的store方法将集合信息写出到文件
        存储内容包括：
            1=欢迎使用本软件,第1次使用免费~
            2=欢迎使用本软件,第2次使用免费~
            3=欢迎使用本软件,第3次使用免费~
            4=本软件只能免费使用3次,欢迎您注册会员后继续使用~
 */
public class StoreInfor {
    public static void main(String[] args) throws IOException {
        Properties pr = new Properties();
        pr.setProperty("1","欢迎使用本软件,第1次使用免费~");
        pr.setProperty("2","欢迎使用本软件,第2次使用免费~");
        pr.setProperty("3","欢迎使用本软件,第3次使用免费~");
        pr.setProperty("4","本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        FileWriter fw = new FileWriter("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\1.txt");
        pr.store(fw,"");
        fw.close();
    }
}
