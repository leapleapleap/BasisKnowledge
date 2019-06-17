package Feb._25_26;

/*  (1) 定义方法public static int getCount(int[] arr,int num)，
        求出指定元素在数组中出现的次数.
	(2) 定义方法public static int getAllCount(int[] arr)，统计
	    数组中出现次数为1的元素一共有多少个。
        (推荐-遍历数组，然后调用第一个方法，求出数组中每个元素在数组
        中出现的次数，如果只出现了一次，就统计)
	(3) 在main方法中定义数组，如int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};。
	    然后调用getAllCount方法，统计只出现一次的元素有多少个。
	    打印结果：数组中只出现一次的元素有2个 */

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查找的数字：");
        int num = sc.nextInt();
        System.out.println(num + "\t出现的次数为：" + getCount(arr, num) + "次。");
        System.out.println("出现的次数为一次的数有：" + getAllCount(arr) + "次。");
    }

    private static int getCount(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                count++;
        }
        return count;
    }

    private static int getAllCount(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (getCount(arr, num) == 1)
                count++;
        }

        return count;
    }

    /*  private static int getMax(int[] arr){
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        }   */
}
