package Feb._25_26;

import java.util.Arrays;

public class Demo01 {

    public static void main(String[] args) {
        int[] arr = {12, 32, 15, 24, 35, 46, 57};
        int i = searchNumber(arr, 24);
        System.out.println("index(old):" + i);
        int[] arrNew = order(arr);
        i = searchNumber(arr, 24);
        System.out.println("index(new):" + i);
        String s = Arrays.toString(arrNew);
        System.out.println(s);
    }

    //排序算法：冒泡算法（从小到大）
    //输入一个乱序数组，返回一个升序的有序数组
    public static int[] order(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    //折半查找
    public static int searchNumber(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (num > arr[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else if (num < arr[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
