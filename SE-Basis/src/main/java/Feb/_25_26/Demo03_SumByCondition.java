package Feb._25_26;

/*  (1) 定义一个长度为6的int类型数组，元素值使用随机数生成（范围为50-80）
	(2) 求出该数组中满足要求的元素和。
	    要求：求和的元素的个位和十位不能包含7,并且只能为偶数。     */

import java.util.Arrays;
import java.util.Random;

public class Demo03_SumByCondition {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[6];
        Random r = new Random();
        //循环给数组赋给随机数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(31) + 50;
        }
        //打印数组
        String s = Arrays.toString(arr);
        System.out.println(s);

        //输出符合要求的数的和
        System.out.println(getTheSum(arr));
    }

    private static int getTheSum(int[] arr) {
        int sum = 0;
        System.out.println("剔除的数字为：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 7 || arr[i] / 10 % 10 == 7 || arr[i] % 2 == 1) {
                System.out.print(arr[i] + "\t");
                continue;
            } else {
                sum += arr[i];
            }
        }
        System.out.println();
        return sum;
    }
}
