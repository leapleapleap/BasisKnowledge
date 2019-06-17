package Mar._01;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        String username = "BlackHorse";
        String password = "coder";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            //用户输入信息
            System.out.println("请输入账号：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            //校验账号密码是否正确
            if (name.equals(username) && pwd.equalsIgnoreCase(password)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账号已锁定，请于管理员联系！");
                } else
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会！");
            }
        }
    }
}
