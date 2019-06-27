package part_01.Mar13.demo03;

import java.util.Calendar;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        //创建一个calendar对象
        Calendar c = Calendar.getInstance();
        //将需要判断的年份设置进去，并将月、日分别设置为3月、1日
        c.set(year, 2, 1);
        //调用方法减去一天
        c.add(Calendar.DATE, -1);
        //即得到了输入年份的二月天数
        System.out.println(year+"年的二月有"+c.get(Calendar.DATE)+"天");

    }
}
