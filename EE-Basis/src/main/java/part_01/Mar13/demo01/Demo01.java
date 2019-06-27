package part_01.Mar13.demo01;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91 27 46 38 50";
        //把字符串中的数字数据存储到一个int类型的数组中
        //public String[] split(String regex)
        String[] str = s.split(" ");

        //定义一个int数组，把String[]数组中的每一个元素存储到int数组中
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            //public static int parseInt(String s) throws NumberFormatException
            arr[i] = Integer.parseInt(str[i]);

            /*  Integer integer = Integer.valueOf(str[i]);
                arr[i] = integer.intValue();    */
        }
        //arrays工具类的sort方法：对int数组进行排序
        //public static void sort(int[] a)
        Arrays.sort(arr);
        //冒泡排序
        /*  for (int i = 0; i < arr.length - 1; i++) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }   */

        //把排序后的int数组中的元素进行拼接得到一个字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                //public StringBuilder append(T t)
                sb.append(arr[i]);
            else
                //链式
                sb.append(arr[i]).append(" ");
        }


        //StringBuilder类中的toString()方法
        //public String toString()
        String string = sb.toString();

        sb.reverse();
        //27 38 46 50 91
        //reverse结果
        //19 05 64 83 72

        System.out.println(string);
    }
}
