package part_03.Mar31.demo13;

import java.util.Scanner;

public class Demo01MethodReference {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
//        printUpperCaseString(s,str-> System.out.println(s.toUpperCase()));

        /*  ~~~推导过程 */
        Printable p1 = new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        Printable p2 = ss-> System.out.println(s.toUpperCase());

        PrintString ps= new PrintString();
        Printable p3 = ps::print;
        printUpperCaseString(s, ps::print);
    }

    public static void printUpperCaseString(String s,Printable p){
        p.print(s);
    }
}
