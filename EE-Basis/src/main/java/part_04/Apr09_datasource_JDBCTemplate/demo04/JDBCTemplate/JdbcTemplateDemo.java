package part_04.Apr09_datasource_JDBCTemplate.demo04.JDBCTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import part_04.Apr09_datasource_JDBCTemplate.demo03.druid.JDBC_Druid_Utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
/* Spring 框架的JdbcTemplate是对JDBC的简单封装 */
public class JdbcTemplateDemo {
    //使用JdbcTemplate需要导包，创建对象是需要传入数据库连接池（个人理解就像是InputStream和BufferedInputStream的关系一样）
    //而DataSource对象是通过工具类JDBC_Druid_Utils获得的，其中数据库连接池由Druid实现
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBC_Druid_Utils.getDataSourse());

    //1.修改id为1的salary为8000
    @Test
    public void test1() {
        String sql = "update emp set salary=? where id = ?";
        //执行sql语句--->修改记录
        int update = jdbcTemplate.update(sql, 8000,1001);
        System.out.println(update);
    }

    //2.添加一条记录
    @Test
    public void test2() {
        String sql = "insert into emp (id,ename,salary) values (?,?,?)";
        //执行sql语句--->插入记录
        int update = jdbcTemplate.update(sql, 1015,"葛若",2000);
        System.out.println(update);
    }

    //3.删除刚才添加的记录
    @Test
    public void test3() {
        String sql = "delete from emp where id = ?";
        //执行sql语句--->删除记录
        int update = jdbcTemplate.update(sql, 1015);
        System.out.println(update);
    }

    //4.查询id为1001的记录，将其封装为Map集合
    @Test
    public void test4() {
        String sql = "select * from emp where id = ?";
        //执行sql语句--->查看一条语句
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 1001);
        System.out.println(stringObjectMap);
    }

    //5.查询所有记录，将其封装为List
    @Test
    public void test5() {
        String sql = "select * from emp";
        //执行sql语句--->查看所有记录
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    //6.查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void test6() {
        String sql = "select * from emp";
        List<Emp> query = jdbcTemplate.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });
        for (Emp emp : query) {
            System.out.println("id"+emp.getId()+"\t姓名"+emp.getEname()+"\t薪水"+emp.getSalary());
        }
    }

    //查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void test7() {
        String sql = "select * from emp";
        //BeanPropertyRowMapper是RowMapper的一个实现类，一般使用这个实现类来完成将数据包装成对象并添加进list的操作
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : query) {
            System.out.println("id"+emp.getId()+"\t姓名"+emp.getEname()+"\t薪水"+emp.getSalary());
        }

    }

    //查询总记录数
    @Test
    public void test8() {
        String sql = "select count(id) from emp";
        //queryForObject方法专门应用于聚合函数的操作
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }
}
