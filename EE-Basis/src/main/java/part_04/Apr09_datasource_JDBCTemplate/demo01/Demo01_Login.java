package part_04.Apr09_datasource_JDBCTemplate.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

@SuppressWarnings("all")
public class Demo01_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        boolean login = login(username, password);
        if (login) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("登录失败");
        }
    }

    private static boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Properties pro = new Properties();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        InputStream inputStream = Demo01_Login.class.getClassLoader().getResourceAsStream("JDBC.properties");

        try {
            pro.load(inputStream);
            connection = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"), pro.getProperty("password"));
            String sql = "select * from user where username = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
