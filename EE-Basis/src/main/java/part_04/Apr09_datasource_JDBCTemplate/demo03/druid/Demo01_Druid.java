package part_04.Apr09_datasource_JDBCTemplate.demo03.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Demo01_Druid {
    public static void main(String[] args) {
        //Druid数据库连接池的配置文件是properties类型的，名称任意、存放位置任意
        //创建Properties对象接收配置文件的配置信息
        Properties pro = new Properties();
        //使用classLoader类的方法获取配置文件的输入流
        //也可以使用绝对路径的方法直接给Properties对象加载配置信息
        InputStream is = Demo01_Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            //加载配置文件
            pro.load(is);
            //使用Druid提供的DruidDataSourceFactory类中的createDataSource(Properties)方法创建数据库连接池对象
            DataSource ds = DruidDataSourceFactory.createDataSource(pro);
            for (int i = 0; i <= 10; i++) {
                Connection connection = ds.getConnection();
                System.out.println(i+":"+connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
