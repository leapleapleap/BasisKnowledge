package Feb._19_20;

public class Demo02 {
    public static void main(String[] args){
        doWhileTest();
        System.out.println("================");
        forTest();
    }

    private static void doWhileTest(){
        int i=100;
        int count = 0;
        do{
            int ge,shi,bai;
            ge=i%10;
            shi=i/10%10;
            bai=i/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.println("水仙花数" + i);
                count++;
            }
            i++;
        }while(i<=999);
        System.out.println("水仙花总共有：" + count + "个");
    }

    public static void forTest(){
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = 0;
            int shi = 0;
            int bai = 0;
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println("水仙花数\t" + i);
                count++;
            }
        }
        System.out.println("水仙花总共有：" + count + "个");

    }
}
