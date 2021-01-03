package part_04.Apr07.demo03.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1_JDBC_Quick_threshold {
    public static void main(String[] args) throws SQLException {
        //1. 导入驱动jar包
        //  1.1 赋值粘贴到指定的包路径
        //  1.2 右键“add as library”
        //2.注册驱动
        // Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        //jdbc:mysql://localhost:3306/db3 可以简写为 jdbc:mysql:///db3
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
        //4.定义sql语句
        String sql = "update account set balance = 2000 where id = 2";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
