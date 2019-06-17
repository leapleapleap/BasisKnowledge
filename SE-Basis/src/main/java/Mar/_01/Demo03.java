package Mar._01;

/*  键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，
    数字字符出现的次数(不考虑其他字符)  */

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int other = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                bigCount++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                smallCount++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numCount++;
            }else {
                other++;
            }
        }

        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字：" + numCount + "个");
        System.out.println("其他：" + other + "个");
    }
}
