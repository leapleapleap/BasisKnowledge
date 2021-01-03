package part_04.Apr09_datasource_JDBCTemplate.demo02.C3P0;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo02_C3P0_Test {
    public static void main(String[] args) throws SQLException {
        //C3P0的配置文件（c3p0-config.xml）名字固定，存放地址固定
        //获取DataSource，使用默认配置
        //DataSource ds = new ComboPooledDataSource();
        //获取DataSource，使用指定名称配置
        //DataSource ds = new ComboPooledDataSource("otherc3p0");
        //循环获取连接对象

        //调用工具类完成数据库连接池的获取
        DataSource ds = JDBC_C3P0_Utils.getDataSource();

        for (int i = 0; i <= 19; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i+":"+connection);
            connection.close();
        }
        /*
        当需要获取连接对象的个数大于连接池中的连接对象个数时，就会发生延时报错
         */
    }
}
