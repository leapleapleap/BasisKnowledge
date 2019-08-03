package part_03.Mar26.demo06;

import java.io.*;

public class Demo01NetCode {    //试用软件使用次数情况模拟
    public static void main(String[] args) throws IOException {
        test01();
        //test02();
    }

    private static void test02() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\Mate.txt"));
        int len;
        if ((len = bis.read()) != -1) {
            bis.close();
            if (len < 3) {
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\Mate.txt"));
                len++;
                bos.write(len);
                System.out.println("欢迎使用本软件,第" + len + "次使用免费~");
                bos.close();
            } else {
                System.out.println("本软件只能免费使用" + len + "次,欢迎您注册会员后继续使用~");
            }
        } else {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\Mate.txt"));
            bos.write(1);
            System.out.println("欢迎使用本软件,第1次使用免费~");
            bos.close();
        }
    }

    private static void test01() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\times.txt"));

        String line = br.readLine();
        int times = Integer.parseInt(line);

        if (times > 0) {
            System.out.println("您还有" + --times + "次试用机会");
            FileWriter fw = new FileWriter("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\times.txt");
            fw.write(times + "");
            fw.flush();
            fw.close();
        } else {
            System.out.println("您的使用次数已到,请购买正版!");
        }
        br.close();
    }
}


