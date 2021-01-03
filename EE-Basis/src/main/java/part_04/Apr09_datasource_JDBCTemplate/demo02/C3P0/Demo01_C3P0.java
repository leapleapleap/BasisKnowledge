package part_04.Apr09_datasource_JDBCTemplate.demo02.C3P0;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * c3p0的演示
 */

public class Demo01_C3P0 {
    public static void main(String[] args) throws Exception {
        //DataSource类是Sun公司定义的关于连接池的抽象类，具体实现需要数据库厂商或第三方提供
        //创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        Connection connection = ds.getConnection();
        //打印
        System.out.println(connection);
    }
}
