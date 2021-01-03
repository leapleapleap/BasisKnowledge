package part_04.Apr09_datasource_JDBCTemplate.demo03.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
    JDBC&Druid数据库连接池技术---工具类
 */
public class JDBC_Druid_Utils {
    //定义私有的静态成员变量--数据库连接池
    private static DataSource ds;

    static {
        //创建Properties对象用于接收本地的配置文件
        Properties pro = new Properties();
        //使用classLoader类中的方法将本地的配置文件转换成输入流
        InputStream is = JDBC_Druid_Utils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            //将输入流加载到Properties对象中
            pro.load(is);
            //使用Druid提供的工厂类的创建数据库连接池方法并传入配置文件，创建数据库连接池对象并赋值给类的成员变量
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取数据库连接池对象的方法
    public static DataSource getDataSourse(){
        return ds;
    }

    //获取数据库连接池对象中的数据库连接对象的方法
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //在数据库连接操作完成之后释放相应的资源的方法
    public static void close(ResultSet rs, Statement st,Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //释放连接对象还给数据库连接池对象，实现复用的目的
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //重载的方法
    public static void close(Statement st,Connection conn){
        close(null,st,conn);
    }
}
