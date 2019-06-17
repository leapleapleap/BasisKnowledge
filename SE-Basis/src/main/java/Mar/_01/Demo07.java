package Mar._01;

import java.util.Random;

/*  1.定义String getStr()方法
		功能描述：
			获取长度为5的随机字符串，字符串由随机的5个大小写字母组成
    2.在main方法中调用上述方法，并打印结果  */
public class Demo07 {
    public static void main(String[] args) {
        System.out.println(getStrMy());
        System.out.println(getStrTeacher());
    }

    public static String getStrMy() {
        StringBuilder str = new StringBuilder();
        Random r = new Random();

        while (true) {
            char cha = (char) (r.nextInt('z' - 'A' + 1) + 'A');
            if ((cha >= 'A' && cha <= 'Z') || (cha >= 'a' && cha <= 'z')) {
                str.append(cha);
            }
            if (str.length() == 5)
                break;
        }
        return str.toString();
    }

    public static String getStrTeacher(){
        StringBuilder str = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            char cha = (char) (r.nextInt('z'-'A'+1) + 'A');
            if ((cha >= 'A' && cha <= 'Z') || (cha >= 'a' && cha <= 'z')) {
                str.append(cha);
            }else
                i--;
        }
        return str.toString();
    }
}
