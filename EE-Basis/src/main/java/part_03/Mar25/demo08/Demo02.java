package part_03.Mar25.demo08;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/*  根据需求、完成代码
      1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
      2. user.txt文件中初始存放的用户信息有如下：
          jack=123
          rose=123
          tom=123
      3.要求完成如下功能：
        程序运行时：控制台提示用户输入注册的用户名和密码；
         验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
         是：控制台提示：用户名已存在
         否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功  */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        //1.从控制台获取用户录入的用户名和密码信息；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        //2.Properties，可以通过流对象把文件中的数据读取到内存，并存储到集合中
        Properties prop = new Properties();
        prop.load(new FileReader("Test01Supplier\\user.txt"));

        //3.得到Properties的键的集合
        Set<String> set = prop.stringPropertyNames();
        //4.遍历键的集合，使用用户录入的用户名和键的集合中的用户名做比较：
        //定义一个变量，用来标记文件中是否存在已有的用户名和当前录入的用户名一样
        boolean flag=false;
        for (String key: set) {
            if (key.equals(username)){
                flag=true;
                break;
            }
        }
        if (flag){
            //存在,提示用户，用户名已存在
            System.out.println("对不起，用户已存在！！！！");
        }else{
            //不存在，把用户录入的用户名和密码存入到Properties集合中，把集合中的数据再写入到user.txt文件中
            prop.setProperty(username, password);
            prop.store(new FileWriter("Test01Supplier\\user.txt"), "");
            System.out.println("恭喜您，注册成功！！！");
        }
    }
}