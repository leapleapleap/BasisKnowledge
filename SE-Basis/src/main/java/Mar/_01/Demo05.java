package Mar._01;

/*  定义一个方法，实现字符串反转。键盘录入一个字符串，
    调用该方法后，在控制台输出结果
        例如，键盘录入 abc，输出结果 cba    */

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        System.out.println(reverse2(s));

        StringBuilder stringBuilder = new StringBuilder(s);
        //public StringBuilder reverse()    //返回字符串序列相反的字符串
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }

    private static String reverse(String s) {
        String ss = "";
        /*
         * As every String concatenation copies the whole String, usually it is preferable to
         * replace it with explicit calls to StringBuilder.append() or StringBuffer.append().
         *
         * */
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }

    private static String reverse2(String s) {
        StringBuilder ss = new StringBuilder();

        for (int length = s.length() - 1; length >= 0; length--) {
            //public StringBuilder append(char c)
            ss.append(s.charAt(length));
        }
        return ss.toString();
    }
}
