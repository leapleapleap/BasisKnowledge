package part_01.Mar14.demo07;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("all")
public class Landlords_TeacherAndMe {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //1、准备牌
        //1.1创建牌的集合
        ArrayList<String> poker = new ArrayList<>();
        //1.2造牌
        //1.2.1创建花色集合/数组
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♦");
        colors.add("♣");
//        String[] colors = {"♥", "♠", "♦", "♣"};

        //1.2.2创建数字集合/数组
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("A");
        for (int i = 2; i < 11; i++) {
            numbers.add(i + "");
//            numbers.add(String.valueOf(i));
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
//        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //1.2.3拼接
        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }
        System.out.println(poker);
        System.out.println("============================");
        //2、洗牌
        Collections.shuffle(poker);

        System.out.println(poker);
        System.out.println("============================");

        //3、发牌

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        /*int count = 0;
        loop:
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j){
                    case 0:
                        player1.add(poker.get(count));
                        break;
                    case 1:
                        player2.add(poker.get(count));
                        break;
                    case 2:
                        player3.add(poker.get(count));
                        break;
                }
                count++;
                if(count == 51)
                    break loop;
            }
        }
        for (int i = 0; i < 3; i++) {
            dipai.add(poker.get(i+51));
        }*/


        /*
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51) {
                dipai.add(s);
                //如果i>=51，则在执行完dipai.add(s)之后结束此轮循环继续往下执行
                continue;
            }
            switch (i % 3) {
                case 0:
                    player1.add(s);
                    break;
                case 1:
                    player2.add(s);
                    break;
                case 2:
                    player3.add(s);
                    break;
            }
        }
        */

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                dipai.add(poker.get(i));
            } else {
                //if else 语句将代码分为两部分，当条件不符合第一部分时执行第二部分
                //若条件符合第一部分则只执行第一部分，而不去管第二部分
                if (i % 3 == 0) {
                    player1.add(poker.get(i));
                } else if (i % 3 == 1) {
                    player2.add(poker.get(i));
                } else {
                    player3.add(poker.get(i));
                }
            }
        }

        //4、看牌
        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);
        System.out.println("底牌：" + dipai);

        System.out.println("============================");

        //5、整牌

        paixu(player1);
        paixu(player2);
        paixu(player3);
        paixu(dipai);

        //6、看牌
        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);
        System.out.println("底牌：" + dipai);

        /*
            1、新建三个集合用来存储整理之后的三个玩家的poker
            2、遍历player的集合，先判断集合中是否有大小王，若有则排
               在第一位，之后删除该poker，若无则进行下一步
            3、使用charAt()方法提取剩余poker的第二位，根据poker的
               规则从2到1之后从K排到3，期间一次存入新集合中
            4、输出新集合
         */
        //1、新建三个集合用来存储整理之后的三个玩家的poker

        /*
        ArrayList<String> np1 = new ArrayList<>();
        ArrayList<String> np2 = new ArrayList<>();
        ArrayList<String> np3 = new ArrayList<>();
        ArrayList<String> ndp = new ArrayList<>();

        sort(player1, np1);
        System.out.println("玩家1：" + np1);
        sort(player2, np2);
        System.out.println("玩家2：" + np2);
        sort(player3, np3);
        System.out.println("玩家3：" + np3);
        sort(dipai, ndp);
        System.out.println("玩家3：" + ndp);
        */
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start));
    }

    /* 排序的方法 */
    public static void paixu(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                String bigger = getBigger(list.get(maxIndex), list.get(j));
                if (bigger.equals(list.get(j))) {
                    maxIndex = j;
                }
            }
            String temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }

    //获取较大的牌面
    public static String getBigger(String c1, String c2) {
        int card1 = getNumberShow(c1);
        int card2 = getNumberShow(c2);
        if (card1 > card2) {
            return c1;
        } else {
            return c2;
        }
    }

    //把牌面转换成数字
    public static int getNumberShow(String s) {
        //局部变量定义时必须初始化
        int numberShow = -1;
        String str = "";
        if (s.contains("10")) {
            str += 10;
        } else if (s.equals("大王") || s.equals("小王")) {
            str = s;
        } else {
            str += s.charAt(1);
        }
        //byte  short  int  char  枚举  字符串
        switch (str) {
            case "3":
                numberShow = 3;
                break;
            case "4":
                numberShow = 4;
                break;
            case "5":
                numberShow = 5;
                break;
            case "6":
                numberShow = 6;
                break;
            case "7":
                numberShow = 7;
                break;
            case "8":
                numberShow = 8;
                break;
            case "9":
                numberShow = 9;
                break;
            case "10":
                numberShow = 10;
                break;
            case "J":
                numberShow = 11;
                break;
            case "Q":
                numberShow = 12;
                break;
            case "K":
                numberShow = 13;
                break;
            case "A":
                numberShow = 14;
                break;
            case "2":
                numberShow = 15;
                break;
            case "小王":
                numberShow = 16;
                break;
            case "大王":
                numberShow = 17;
                break;

        }
        return numberShow;
    }


    //自己的笨方法--->使用多次循环遍历，根据斗地主的游戏规则按照牌面由大到小的顺序逐次取出每个玩家手中的牌并放到新的集合中
/*
    private static ArrayList<String> sort(ArrayList<String> list, ArrayList<String> nlist) {
        //2、遍历player的集合，先判断集合中是否有大小王，若有则排在第一位，之后删除该poker，若无则进行下一步
        for (String s : list) {
            if ("大王".equals(s)) {
                nlist.add(s);
            }
        }
        for (String s : list) {
            if ("小王".equals(s))
                nlist.add(s);
        }

        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("2")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("A")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("K")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("Q")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("J")) {
                nlist.add(s);
                continue;
            }
        }
        //"10"号牌面对应字符串的第二位（即索引为1的字符）字符为‘1’
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("1")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("9")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("8")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("7")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("6")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("5")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("4")) {
                nlist.add(s);
                continue;
            }
        }
        for (String s : list) {
            String ss = String.valueOf(s.charAt(1));
            if (ss.equals("3")) {
                nlist.add(s);
                continue;
            }
        }
        return nlist;
    }
*/


}
