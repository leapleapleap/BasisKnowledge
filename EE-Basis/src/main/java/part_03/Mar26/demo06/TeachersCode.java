package part_03.Mar26.demo06;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/*
第一题：分析以下需求，并用代码实现
	实现一个验证程序运行次数的小程序，要求如下：
	1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
	2.程序运行演示如下:
		第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
		第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
		第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
		第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
 */
public class TeachersCode {

    public static void main(String[] args) throws Exception {
        //1.读取文件中的次数，使用Properties集合存储读取的内容
        Properties p = new Properties();
        p.load(new FileReader("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\count.properties"));

        //2.给次数++；
        String count = p.getProperty("count");
        int numCount = Integer.parseInt(count);
        numCount++;

        //3.判断是第几次运行，当前的次数是否大于3，
        if (numCount > 3) {
            // 如果大于，则提示用户：本软件只能免费使用3次,欢迎您注册会员后继续使用~
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        } else {
            //如果不大于，则正常运行，提示：欢迎使用本软件,第n次使用免费~
            System.out.println("欢迎使用本软件,第" + numCount + "次使用免费~");
            //运行完毕后，把最新的次数存储到文件中
            p.setProperty("count", numCount + "");
            p.store(new FileWriter("D:\\develop\\programs\\b_March08~March31_EE_Basics\\src\\_0326_stu_stream_plus\\homework01\\count.properties"), "");
        }
    }
}
