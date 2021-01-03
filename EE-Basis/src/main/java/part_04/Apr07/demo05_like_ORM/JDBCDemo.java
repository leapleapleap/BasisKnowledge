package part_04.Apr07.demo05_like_ORM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class JDBCDemo {

    public static void main(String[] args) {
        List<Emp> all = getAll();
        for (Emp emp : all) {
            System.out.println(emp);
        }
        System.out.println(all.size());
    }

    //定义静态方法查询数据库中信息
    public static List<Emp> getAll() {

        //提升对象的等级，让它们的作用域扩大
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //创建list集合保存记录对象
        List<Emp> list = new ArrayList<>();
        //在循环外定义一个引用，防止栈内存中存在多个引用对象

        try {
            //1.注册驱动文件（固定写法：com.mysql.jdbc.Driver）
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager类是java管理驱动的一个类，其中有需要关于驱动的方法
            //2.使用DriverManager类的getConnection方法获取与数据库的连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            //createStatement返回一个statement类的实现类对象，该实现类在驱动中
            statement = connection.createStatement();
            //定义一个MySQL语句
            String sql = "select * from emp";

            resultSet = statement.executeQuery(sql);
            Emp emp = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
                list.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
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
        return list;
    }
}
