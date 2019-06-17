package Mar._03_04;

/*      有一个已经排好序的数组[1, 8, 26, 45, 60, 78, 99]，现在键盘录入一个0-100
    之间（范围无需代码判断）的数字，将该数字按从小到大顺序插入到该数组（如输入数字50,
    那么这个数组的结果为：[1, 8, 26, 45, 50, 60, 78, 99]）
    并在控制台中打印插入前和插入后的数组。 */

import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {
        int[] a = {1, 8, 26, 45, 54, 60, 78, 88, 95, 99};
        Random r = new Random();
        int num = r.nextInt(101);
        System.out.println(num);
        arrayToString(a);
        a = insertOne(a, num);
        arrayToString(a);
    }

    private static int[] insertOne(int[] a, int num) {
        int[] c = new int[a.length + 1];
        loop:
        for (int i = 0, j = i - 1; i < a.length; i++) {
            //数组中的第一个数字都比输入的数字大时
            if (i == 0 && a[i] > num) {
                //从后向前将传入的数组赋给新数组
                for (int k = a.length; k > 0; k--) {
                    c[k + 1] = a[k];
                }
                //将输入的数字放在新数组的0索引位置
                c[0] = num;
                //跳出大循环
                break loop;
                //数组中的最后一个数字都比输入的数字小时
            } else if (i == a.length - 1 && a[i] < num) {
                //按顺序将原数组中的元素赋值给新数组
                for (int k = 0; k < a.length; k++) {
                    c[k] = a[k];
                }
                //将输入的数字放在新数组的最后一位
                c[c.length - 1] = num;
                //跳出大循环
                break;
            } else {
                //按顺序将原数组中的元素赋值给新数组
                c[i] = a[i];
                //当第i位的元素大于输入的数字时
                if (a[i] > num) {
                    c[i] = num;
                    for (i = i + 1; i < c.length; i++) {
                        c[i] = a[i - 1];
                    }
                    break;
                }
            }
        }
        return c;
    }

    private static void arrayToString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
