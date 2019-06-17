package Feb._22_23;
//*逢七过*
/*  需求：
          朋友聚会的时候可能会玩一个游戏：逢七过。规则是：从任意一个数字开始报数，
      当你要报的数字包含7或者是7的倍数时都要说：过。为了帮助大家更好的玩这个游戏，
      这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
          这样，大家将来在玩游戏的时候，就知道哪些数据要说：过。 */
@SuppressWarnings("all")
public class Demo07_EverySevenPass {
    public static void main(String[] args) {
        System.out.println("1-100之间的满足逢七必过规则的数据:");
        //byFor();
        byWhile();
    }

    public static void byFor(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {

            //如果一个数满足个位或十位包含7或者取模7结果为0，则输出该数字
            if (i%10==7||i/10%10==7||i%7==0){
                count++;
                System.out.print(i+"\t");
                //一行输出五个数字
                if (count % 5 == 0){
                    System.out.println();
                }

            }
        }
    }

    public static void byWhile(){
        int i = 1;
        int count = 0;
        while (i <= 100) {
            if (i%10==7||i/10%10==7||i%7==0){
                //一行输出五个数字
                if (count % 5 == 0){
                    System.out.println();
                }
                System.out.print(i+"\t");
                count++;
            }
            i++;
        }
    }
}
