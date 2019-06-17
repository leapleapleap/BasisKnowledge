package Mar._01;

/*  定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回,
    调用该方法,并在控制台输出结果。例如,数组为 int[] arr = {1,2,3};
    执行方法后的输出结果为：[1, 2, 3] */

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(arrToString2(arr));
    }

    private static String arrToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                s += arr[i];
            else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    private static String arrToString2(int[] arr){
        StringBuilder s = new StringBuilder();

        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                s.append(arr[i]);
            }else {
                s.append(arr[i]).append(", ");
            }
        }
        s.append("]");
        return s.toString();

    }
}
