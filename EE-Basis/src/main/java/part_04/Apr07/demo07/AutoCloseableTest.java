package part_04.Apr07.demo07;

import part_04.Apr07.demo05_like_ORM.Emp;
import part_04.Apr07.demo06.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*   The try-with-resources statement is a try statement that declares one or more resources.
 A resource is an object that must be closed after the program is finished with it. The
 try-with-resources statement ensures that each resource is closed at the end of the statement.
 Any object that implements java.lang.AutoCloseable, which includes all objects which implement
 java.io.Closeable, can be used as a resource.  */

//实现AutoCloseable接口并重写其close方法
@SuppressWarnings("all")
public class AutoCloseableTest implements AutoCloseable {

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    //定义静态方法查询数据库中信息--->静态调静态
    public static List<Emp> getAll() {
        //创建list集合保存记录对象
        List<Emp> list = new ArrayList<>();
        //在循环外定义一个引用，防止栈内存中存在多个引用对象
        Emp emp = null;
        try {
            /*  1.调用JDBCUtils工具类的getConnection方法时会先加载静态代码块，读取配置文件中的相关
                  信息并且赋值给对应的静态成员方法，其后会在静态代码块中完成注册驱动的工作
                2.getConnection方法中会调用DriverManager中的getConnection方法，参数传递的是相应
                  的静态成员变量的名称    */
            connection = JDBCUtils.getConnection();

            //创建SQL执行对象---->由于创建的执行对象根据需求的变化可能不同所以不能封装到工具类中
            statement = connection.createStatement();
            //创建MySQL执行语句
            String sql = "select * from emp";

            //执行数据库操作，当数据库的操作为DQL时返回值为ResultSet对象
            resultSet = statement.executeQuery(sql);
            //调用ResultSet对象的next方法判断是否还有下一条记录，存在为true，不存在为false
            while (resultSet.next()) {
                //当为true时即存在下一条记录，将记录中的各项封装为一个记录对象
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                //将一个记录的各项数据封装为一个记录对象
                emp = new Emp
                        (id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
                //将数据对象添加到集合中
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //在finally语句中执行释放资源的语句
        }
        //返回存放数据对象的集合，供后续使用
        return list;
    }

    @Override
    public void close() throws Exception {
        JDBCUtils.close(resultSet, statement, connection);
    }

    public static void main(String[] args) {
        List<Emp> all = getAll();
        //循环输出所有记录对象
        for (Emp emp : all) {
            System.out.println(emp);
        }
        //输出记录对象的个数
        System.out.println(all.size());
    }
}
