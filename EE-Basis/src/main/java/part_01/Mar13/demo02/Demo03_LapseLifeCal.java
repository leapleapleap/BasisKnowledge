package part_01.Mar13.demo02;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Demo03_LapseLifeCal {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期(yyyy-MM-dd):");
        String birthdayStr = sc.nextLine();
        Date birthday = DateUtils.stringToDate(birthdayStr, "yyyy-MM-dd");
        /*  public static Date stringToDate(String s, String f) throws ParseException {
                SimpleDateFormat sdf = new SimpleDateFormat(f);
                return sdf.parse(s);
            }  */

        //已经度过的岁月
        long l = System.currentTimeMillis() - birthday.getTime();
        int lifeTime = (int) (l * 1.0 / 1000 / 60 / 60 / 24);
        System.out.println("已经活了" + lifeTime + "天");

        //还能有多少岁月
        System.out.print("按照人的平均寿命折算成天数为30000天计算：您");
        System.out.println("还能活" + (30000 - lifeTime) + "天");
    }
}
