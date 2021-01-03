package part_04.Apr07.demo04.DQL;

import java.sql.*;

@SuppressWarnings("all")
public class JDBCDemo_DQL {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            //3.定义sql
            String sql = "select * from account";
            //4.获取执行sql对象
            statement = connection.createStatement();
            //5.执行sql
            resultSet = statement.executeQuery(sql);
            //6.处理结果
            //循环判断游标是否是最后一行末尾。
            while (resultSet.next()) {
                //获取数据
                //6.2 获取数据
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble(3);

                System.out.println(id + "---" + name + "---" + balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
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
    }
}
