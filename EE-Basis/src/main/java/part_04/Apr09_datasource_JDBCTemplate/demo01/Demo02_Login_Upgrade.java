package part_04.Apr09_datasource_JDBCTemplate.demo01;


import part_04.Apr07.demo06.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*     练习：
		* 需求：
			1. 通过键盘录入用户名和密码
			2. 判断用户是否登录成功   */
@SuppressWarnings("all")
public class Demo02_Login_Upgrade {
    public static void main(String[] args) {
        //键盘录入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //调用方法判断用户输入的账号密码是否存在
        boolean login = new Demo02_Login_Upgrade().login(username, password);
        if (login) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("登录失败");
        }
    }

    public boolean login(String username, String password) {
        //如果用户输入的账号或者密码为空则返回false
        if (username == null || password == null) {
            return false;
        }
        //定义JDBC的一系列对象
        Connection connection= null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            /*  工具类中的功能分布：
                1.静态代码块加载配置文件，获取配置文件中的url、user、password、driver信息
                2.将获得到的相关信息赋值给工具类中的静态成员变量
                3.在静态代码块中加载驱动（Class.forName(driver)）
                4.创建获取连接对象的方法、关闭资源的方法
                    4.1获取连接对象--->DriverManager.getConnection(url, user, password);
                    4.2关闭资源   */
            //调用工具类JDBCUtils的getConnection方法获取connection对象
            connection = JDBCUtils.getConnection();
            //创建sql语句
            String sql = "select * from user where username = ? and password = ?";
            //创建PreparedStatement类的对象，将sql语句预加载进数据库中，其中？为占位符
            preparedStatement = connection.prepareStatement(sql);
            //给sql中的占位符位置赋值
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            //使用PreparedStatement对象的方法执行sql语句
            resultSet = preparedStatement.executeQuery();
            //当resultSet.next()为true是表示查到该用户的注册信息，登录成功，否则，登录失败
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //调用工具类的释放资源的方法
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
        return false;
    }
}
