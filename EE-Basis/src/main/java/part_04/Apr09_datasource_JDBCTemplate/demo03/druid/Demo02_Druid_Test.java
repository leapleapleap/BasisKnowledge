package part_04.Apr09_datasource_JDBCTemplate.demo03.druid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo02_Druid_Test {
    public static void main(String[] args) {
        // 创建连接对象和sql语句执行对象
        Connection connection = null;
        PreparedStatement ps = null;
        // 使用工具类JDBC_Druid_Utils获得DataSource（数据库连接池对象）
        DataSource ds = JDBC_Druid_Utils.getDataSourse();
        try {
            // 使用数据库连接池对象获取连接对象
            connection = ds.getConnection();
            // 创建sql执行语句
                // 添加一条记录到表中
            // String sql = "insert into Emp (id,ename)values(?,?)";
                // 从表中删除一条记录
            String sql = "delete from emp where id = ?";
            /*
                PreparedStatement对象是会将sql语句提前传给MySQL进行预编译，语句中不确定的变量都用占位符？代替
                在执行语句之前通过该对象的setXxx方法将实际参数传入指定位置
             */
            ps = connection.prepareStatement(sql);
            // 给占位符赋值
            // ps.setInt(1,1015);
            // ps.setString(2,"葛若");
            ps.setInt(1,1015);

            // 执行PreparedStatement语句
            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            // 释放、归还相应的资源
            JDBC_Druid_Utils.close(ps,connection);
        }
    }
}