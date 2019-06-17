package Feb._22_23;

import java.util.Scanner;

public class Demo01_Scanner {
    public static void main(String[] args) {
        //第二步：创建对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        //第三步：接收字符串(包含空格)数据
        String s = sc.nextLine();
        System.out.println(s);

        System.out.println("请输入一个字符：");
        //第三步：接收字符数据(字符串调用charAt方法)
        char c = sc.next().charAt(0);
        System.out.println(c);

        System.out.println("请输入一个整数：");
        //第三步：接收整数数据
        int i = sc.nextInt();
        System.out.println(i);
    }
}
