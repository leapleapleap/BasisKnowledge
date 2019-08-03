package part_03.Mar25.demo08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\ZY\\Desktop\\user.txt");
        p.load(fis);
        fis.close();
        String name;
        Scanner sc = new Scanner(System.in);
        loop:
        while(true) {
            System.out.println("请输入用户名：");
            name = sc.nextLine();
            //获取properties中的键名集合
            Set<String> strings = p.stringPropertyNames();
            //循环判断
            for (String string : strings) {
                if (string.equals(name)) {
                    System.out.println("用户名已存在,请重新输入！");
                    System.out.println("------------------------");
                    continue loop;
                }
            }
            break;
        }
        System.out.println("请输入密码：");
        int next = sc.nextInt();
        p.setProperty(name,next+"");
        FileOutputStream os = new FileOutputStream("C:\\Users\\ZY\\Desktop\\user.txt");
        p.store(os,"20190325");
        os.close();
        System.out.println("注册成功");
    }
}
