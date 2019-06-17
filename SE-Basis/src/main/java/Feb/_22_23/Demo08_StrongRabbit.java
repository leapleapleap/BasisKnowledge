package Feb._22_23;
// *不死神兔*

/*  需求：有一对兔子，从出生后第3个月起每个月都生一对兔子，
    小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
    问第二十个月的兔子对数为多少？ */

//斐波那契数列~~~

public class Demo08_StrongRabbit {
    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0] = 1;
        System.out.println("第" + 1 + "个月有" + arr[0] + "对兔子");
        arr[1] = 1;
        System.out.println("第" + 2 + "个月有" + arr[1] + "对兔子");

        //for循环
        /*  for (int i = 2; i < 20; i++) {
                arr[i] = arr[i-2] + arr[i-1];
                System.out.println("第"+(i+1)+"个月有"+arr[i]+"对兔子");
            }   */

        //while循环
        /*  int i = 2;
            while ( i < 20){
                arr[i] = arr[i-2] + arr[i-1];
                System.out.println("第"+(i+1)+"个月有"+arr[i]+"对兔子");
                i++;
            }   */

        //do...while循环
        /*  int i = 2;
            do {
                arr[i] = arr[i - 2] + arr[i - 1];
                System.out.println("第"+(i+1)+"个月有"+arr[i]+"对兔子");
                i++;
            }while (i<20);  */
    }
}
