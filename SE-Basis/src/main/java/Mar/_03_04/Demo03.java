package Mar._03_04;

/*
    编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）
        ①.若不符合要求，则提示用户重新输入直至符合要求为止
        ②.若符合要求，则判断字符串中大写字母出现次数并打印  */

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入带字母的字符串:");
        int smallCount = 0;
        int largeCount = 0;
        while(true){
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] >= 'A' && chars[i]<= 'Z'){
                    largeCount++;
                }else if(chars[i] >= 'a' && chars[i]<= 'z'){
                    smallCount++;
                }
            }
            if(largeCount ==0 && smallCount == 0){
                System.out.println("输入错误，请重新输入带字母的字符串:");
            }else{
                System.out.println("输入的字符串中含大写字母"+largeCount+"个");
                System.out.println("输入的字符串中含小写字母"+smallCount+"个");
                break;
            }
        }
    }
}
