package part_02.Mar20.demo13;

/*  分别使用 String 的 += 和 StringBuilder 的 append 方法对字符串做
    100000次拼接，计算 String 拼接100000次花费时间与 StringBuilder
    拼接100000次所花费时间并打印。  */
public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = new String();
        long start = System.currentTimeMillis();

        /*for (int i = 0; i < 100000; i++) {
            s+=i;
        }*/

        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();


        System.out.println(end - start);
    }
}
