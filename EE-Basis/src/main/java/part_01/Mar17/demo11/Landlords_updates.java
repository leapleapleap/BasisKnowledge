package part_01.Mar17.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Landlords_updates {
    public static void main(String[] args) {
        /*
            1.准备阶段
         */
        //创建poker集合，存储按照游戏规则排序的String类型poker及其对应的索引
        HashMap<Integer, String> poker = new HashMap<>();
        //并同时创建ArrayList集合存储其索引，之后的洗、发、整牌都通过操作其索引来执行
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //创建两个List集合并调用static <E> List<E> of(E... e)方法来分别存储poker的花色及数字
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //初始化索引值
        int index = 0;
        //对于大王、小王做特殊处理，先行添加到Map集合中，同时将索引存入ArrayList集合中
        poker.put(index, "大王");
        pokerIndex.add(index++);
        poker.put(index, "小王");
        pokerIndex.add(index++);

        //循环存储剩余的52张poker（按照游戏规则存储）
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index++);
            }
        }
        /*System.out.println(poker);
        System.out.println(pokerIndex);*/

        /*
            2.洗牌
                调用Collections工具类中的shuffle()方法打乱顺序
         */

        Collections.shuffle(pokerIndex);

        /*
            3.发牌
         */

        //创建ArrayList集合存储每个选手和底牌的索引值
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i >= 51) {
                dipai.add(pokerIndex.get(i));
            } else if (i % 3 == 0) {
                player1.add(pokerIndex.get(i));
            } else if (i % 3 == 1) {
                player2.add(pokerIndex.get(i));
            } else if (i % 3 == 2) {
                player3.add(pokerIndex.get(i));
            }
        }

        /*System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);*/

        /*
            4.整牌
                调用Collections工具类中的sort()方法排序
         */

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        /*
            5.看牌
                调用看牌方法输出每个选手的牌
         */


        lookPoker("刘德华", poker, player1);
        lookPoker("周润发", poker, player2);
        lookPoker("周星驰", poker, player3);
        lookPoker("底牌", poker, dipai);


    }


    //看牌方法
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        //输出选手姓名
        System.out.print(name + ": ");
        //遍历已经排好序的选手的pokerIndex集合
        for (Integer key : list) {
            //在poker集合中找到对应Index索引（Key）的String字符串（Value）
            System.out.print(poker.get(key) + " ");
        }
        System.out.println();
    }


}
