package part_01.Mar10.demo05;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {24,96,88,57,13};

        //int[] newArr = bubbleSort(arr);
        //System.out.println(array2String(newArr));

        //Arrays工具类
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static String array2String(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
