package Feb._22_23;

/*  需求：已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现
    把数组中的元素值交换，交换后的数组 arr = {50, 46, 37, 28, 19};
    并在控制台输出交换后的数组元素。    */

public class Demo11 {
    public static void main(String[] args) {
        int[] arrOld = {19, 28, 37, 46, 50};
        System.out.println("交换前的数组");
        arrayToString(arrOld);

        //int[] arrNew = changer(arrOld);
        int[] arrNew = changer_2(arrOld);

        System.out.println("交换后的数组");
        arrayToString(arrNew);
    }

    //工具方法：只用于辅助实现该类的其他方法，应该使用private修饰
    private static int[] changer(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    private static int[] changer_2(int[] arr) {
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
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
