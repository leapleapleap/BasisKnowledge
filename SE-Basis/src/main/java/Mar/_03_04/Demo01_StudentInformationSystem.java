package Mar._03_04;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("all")
public class Demo01_StudentInformationSystem {

    /*main方法*/
    public static void main(String[] args) {
        //新建arrayList对象
        ArrayList<Student> arr = new ArrayList<>();

        //永真循环
        while (true) {
            //输出主界面信息
            System.out.println();
            System.out.println();
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("\t1\t添加学生");
            System.out.println("\t2\t删除学生");
            System.out.println("\t3\t修改学生");
            System.out.println("\t4\t查看所有学生");
            System.out.println("\t5\t退出系统");
            System.out.print("\t请输入你的选择:");
            //新建Scanner对象
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //switch语句判断决定用户想要执行的功能
            //loop:
            switch (line) {
                case "1":
                    //添加学生
                    addStudent(arr);
                    break;
                case "2":
                    //删除学生
                    deleteStudent(arr);
                    break;
                case "3":
                    //修改学生"
                    changeStudent(arr);
                    break;
                case "4":
                    //查看所有学生"
                    showAllStudent(arr);
                    break;
                case "5":
                    //退出系统
                    System.out.println();
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~谢谢使用!~~~~~~~~~~~~~");
                    //break loop;
                    System.exit(0);//退出JVM
            }
            //  if("5".equals(line))
            //      break;
        }

    }

    /*添加学生信息*/
    public static void addStudent(ArrayList<Student> arr) {
        //创建Scanner对象，用于接收键盘输入
        Scanner sc = new Scanner(System.in);
        //新建学生对象
        Student stu = new Student();
        loop:
        //标签
        while (true) {
            System.out.println("请输入学生学号：(或exit退出添加功能)");
            //接收键盘输入的学号信息
            String sid = sc.nextLine();
            if (sid.equalsIgnoreCase("exit"))
                //返回主界面
                return;
            //循环arr集合中元素查看学号是否重复（学号唯一要求）
            for (int i = 0; i < arr.size(); i++) {
                //如果输入的学号已存在
                if (arr.get(i).getSid().equals(sid)) {
                    System.out.println("您输入的学号已存在，请重新输入！" +
                            "\n(或输入“Exit”返回主界面)");
                    continue loop;
                }
            }
            //若学号不存在，则给学生对象实例的sid赋值
            stu.setSid(sid);
            //跳出循环
            break;
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生住址：");
        String address = sc.nextLine();

        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);

        //将学生对象实例添加到集合arr中去
        arr.add(stu);
        System.out.println("添加学生成功");
    }


    /*显示学生信息*/
    public static void showAllStudent(ArrayList<Student> arr) {
        //若集合arr内无元素则输出以下信息
        if (arr == null || arr.size() == 0) {
            System.out.println("无学生信息，请添加学生信息！");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t住址\n");
        //按照一定的格式循环输入arr中各元素的成员变量
        for (int i = 0; i < arr.size(); i++) {
            //将arr集合的元素赋值给对应类型的变量
            Student s = arr.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" +
                    s.getAge() + "岁\t\t" + s.getAddress() + "\n");
        }

    }


    /*删除学生信息*/
    public static void deleteStudent(ArrayList<Student> arr) {
        //若集合arr内无元素则输出以下信息
        if (arr == null || arr.size() == 0) {
            System.out.println("无学生信息，请添加学生信息！");
            return;
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入需要删除的学生学号：" +
                    "\n(或输入“Exit”返回主界面)");
            String sid = sc.nextLine();
            //退出该方法返回主界面
            if (sid.equalsIgnoreCase("exit"))
                return;

            //定义计数器
            int index = 0;

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getSid().equals(sid)) {
                    arr.remove(i);
                    System.out.println("删除学生信息成功！");
                    return;
                }
                index++;
            }

            if (index == arr.size()) {
                System.out.println("查无此人，请重新输入！" +
                        "\n(或输入“Exit”返回主界面)");
            } else {
                System.out.println("删除操作成功");
                return;
            }
        }
    }


    /*修改学生信息*/
    public static void changeStudent(ArrayList<Student> arr) {
        //若集合arr内无元素则输出以下信息
        if (arr == null || arr.size() == 0) {
            System.out.println("无学生信息，请添加学生信息！");
            return;
        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入需要修改的学生学号：" +
                    "\n(或输入“Exit”返回主界面)");
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("Exit")) {
                return;
            }
            int i;
            for (i = 0; i < arr.size(); i++) {
                Student s = arr.get(i);
                if (s.getSid().equals(line)) {
                    System.out.println("请输入新的姓名：");
                    s.setName(sc.nextLine());
                    System.out.println("请输入新的年龄：");
                    s.setAge(sc.nextLine());
                    System.out.println("请输入新的地址：");
                    s.setAddress(sc.nextLine());
                    arr.set(i, s);
                    break;
                }
            }

            //修改ArrayList集合中对应元素的（引用类型）的成员变量
            /*for (i = 0; i < arr.size(); i++) {
                if (arr.get(i).getSid().equals(line)) {
                    System.out.println("请输入新的姓名：");
                    arr.get(i).setName(sc.nextLine());
                    System.out.println("请输入新的年龄：");
                    arr.get(i).setAge(sc.nextLine());
                    System.out.println("请输入新的地址：");
                    arr.get(i).setAddress(sc.nextLine());
                    break;
                }
            }*/
            if (i == arr.size()) {
                System.out.println("查无此人，请重新输入!" +
                        "\n(或输入“Exit”返回主界面)");
                continue;
            } else {
                System.out.println("学生信息修改成功");
                break;
            }
        }
    }
}
