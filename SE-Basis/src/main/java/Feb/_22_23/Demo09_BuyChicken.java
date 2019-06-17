package Feb._22_23;

//*百钱买百鸡*

/*  需求：我国古代数学家张丘建在《算经》一书中提出的数学问题：
        鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
        百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？ */

public class Demo09_BuyChicken {
    public static void main(String[] args) {
        //test01();
        test02();
    }

    //可买鸡翁的数目范围：0~15
    //可买鸡母的数目范围：0~25(可以取到25)
    //可买鸡雏的数目范围：0~100
    public static void test01(){
        int money = 100;
        int sum = 100;
        for (int jw = 0; jw < 15; jw++) {
            for (int jm = 0; jm <= 25; jm++) {
                for (int jc = 0; jc < 100; jc++) {
                    if (jc % 3 == 0 && (jw * 5 + jm * 3 + jc / 3 == money)
                            && (jw + jm + jc == sum)) {
                        System.out.println("鸡翁" + jw + "个,鸡母" +
                                jm + "个,鸡雏" + jc + "个！");
                    }
                }
            }
        }
    }

    public static void test02(){
        for (int w = 0; w < 15; w++) {
            for (int m = 0; m <= 25; m++) {
                int c = 100 - (w + m);
                if (c % 3 == 0 && (w * 5 + m * 3 + c / 3) == 100) {
                    System.out.println("鸡翁" + w + "个,鸡母" + m +
                            "个,鸡雏" + c + "个！");
                }
            }
        }
    }
}
