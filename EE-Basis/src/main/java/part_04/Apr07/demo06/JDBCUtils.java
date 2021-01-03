package part_04.Apr07.demo06;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

@SuppressWarnings("all")
public class JDBCUtils {

    /*  定义静态成员变量接收静态代码块中加载自properties的配置文件信息
            1.修改的是配置文件而非代码，提高了代码的安全性
            2.真正做到了代码根据你传入的信息执行并返回信息    */
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /*  文件的读取，只需要读取一次即可拿到这些值。
            静态代码块只加载一次，用来读取配置文件并赋值给静态成员变量   */
    static {
        //1.获取Properties集合类

        /*2.获取src路径下的文件的方式--->ClassLoader类加载器
                ClassLoader类中的getXxx方法默认的相对路径从src文件夹开始
                若使用一般的相对路径写法，则从模块开始*/
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("JDBC.properties");
        //获取统一资源标签
//        URL resource = classLoader.getResource("pro_JDBC.properties");
//        String path = resource.getPath();
        try {
            Properties p = new Properties();
            //3.加载文件
            p.load(resourceAsStream);
            //通过URL的getPath方法获取的properties文件路径
            //p.load(new FileReader(path));
            //直接加载指定路径（相对于模块的properties文件相对路径）
            //p.load(new FileReader("JavaEE_Web\\src\\pro_JDBC.properties"));

            //4.获取数据并赋值给静态成员变量
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");
            driver = p.getProperty("Driver");

            //5，注册驱动
            Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接对象
     * @return 连接对象Connection
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        //使用静态成员变量获取自静态代码块获取自配置文件properties的相关信息
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     * @param statement  MySQL语句执行对象
     * @param connection 连接对象
     */
    //当SQL语句为DML\DDL时没有ResultSet对象，在释放资源时只需要释放两个对象的资源
    public static void close(Statement statement, Connection connection) {
        //释放资源时应该遵守先创建后释放，后创建先释放的原则
        /*if (statement != null) {
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
        }*/
        close(null,statement,connection);
    }

    /**
     * 释放资源
     * @param resultSet  查询语句返回的结果集
     * @param statement  MySQL语句执行对象
     * @param connection 连接对象
     */
    //当SQL语句为DQL时返回ResultSet对象，这样在释放资源时就需要释放三个对象的资源
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        //释放资源时应该遵守先创建后释放，后创建先释放的原则
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
