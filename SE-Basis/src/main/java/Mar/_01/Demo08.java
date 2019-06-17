package Mar._01;

import java.util.Scanner;

/*
    1.键盘录入一个字符串
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容
 */
public class Demo08 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        System.out.println(changeEven(viewAndChange(upperToLower(stringToCharArray(s)))));
    }

    //将该字符串变成字符数组(不能使用toCharArray()方法)
    private static char[] stringToCharArray(String s) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }

    //将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
    private static char[] upperToLower(char[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 91)
                c[i] += 32;
        }
        return c;
    }

    //将字符数组中的所有小写字母变成大写字母(不能使用toLowerCase()方法)
    private static char[] lowerToUpper(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97 && ch[i] <= 123)
                ch[i] -= 32;
        }
        return ch;
    }

    //如果第一位和最后一位的内容不相同,则交换
    private static char[] viewAndChange(char[] ch) {
        if (ch[0] != ch[ch.length - 1]) {
            char temp = ch[0];
            ch[0] = ch[ch.length - 1];
            ch[ch.length - 1] = temp;
        }
        return ch;
    }

    //将字符数组中索引为偶数的元素变成'~'

    private static char[] changeEven(char[] ch) {

        for (int i = 0; i < ch.length; i += 2) {
            ch[i] = '~';
        }
        return ch;
    }
}
