package Feb._22_23;

import java.util.Random;

public class Demo06_Test{
    public static void main(String[] args) {
        //定义一个数组用来存储成绩
        int[] arr = new int[77];
        //新建一个随机数对象
        Random r = new Random();
        //循环存储随机数并存储进数组
        for (int i = 0; i < 77; i++) {
            arr[i] = r.nextInt(101);
        }
        //每行放十一个成绩
        for (int k = 0; k < arr.length; k++) {
            if (k % 11 ==0) {
                System.out.println();
            }
            System.out.print(arr[k]+"\t");
        }
        //换行
        System.out.println();

        //总成绩
        int num = 0;
        //不及格人数
        int count = 0;
        //最高成绩和最低成绩
        int max = arr[0], min = arr[0];
        //平均成绩
        double equal = 0.0;
        //循环计算不及格人数以及总成绩
        for (int j = 0; j < 77; j++) {
            if (arr[j] < 60)
                count++;
            num+= arr[j];
        }
        //循环比较得到最大值和最小值
        for (int l = 1; l < arr.length; l++) {

            if (arr[l] > max){
                max = arr[l];
            }else if (arr[l] < min){
                min = arr[l];
            }
        }
        equal = num / ((double)arr.length);
        System.out.println("不及格的人数为："+count);
        System.out.println("全班的总分数为："+num);
        System.out.println("全班的平均分为："+equal);
        System.out.println("全班的最高分为："+max);
        System.out.println("全班的最低分为："+min);
    }
}
