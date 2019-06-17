package Feb._19_20;

import java.util.Scanner;

public class Demo04_SwitchDemo {
    public static void main(String[] args){
        System.out.println("请输入星期数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a >= 1) && (a <= 7)){
            switch (a) {
                case 1:
                    System.out.println("Monday!");
                    break;
                case 2:
                    System.out.println("Tuesday!");
                    break;
                case 3:
                    System.out.println("Wednesday!");
                    break;
                case 4:
                    System.out.println("Thursday!");
                    break;
                case 5:
                    System.out.println("Friday!");
                    break;
                case 6:
                    System.out.println("Saturday!");
                    break;
                case 7:
                    System.out.println("Sunday!");
                    break;
            }
        }else{
            System.out.println("输入值有误，请重新输入：");
        }
    }

}
