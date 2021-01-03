package part_06.April27_session_jsp.session_loginDemo.dao;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import part_06.April27_session_jsp.session_loginDemo.domain.User;
import part_06.April27_session_jsp.session_loginDemo.utils.JDBCUtils;

/*
    操作数据库的类
 */
public class Usersdao {
    //创建JdbcTemplate传入数据库连接池对象
    //数据库连接池使用工具类获取
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    //创建登录方法，传入对象
    public User login(User loginUser){
        try {
            //创建sql语句，使用占位符填充相关信息
            String sql = "select * from users where username = ? and password = ?";
            //使用Template对象的查询方法将查询到的结果放入user对象中
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());
            //当查询结果存在时返回该查询结果
            return user;
            //若查询结果不存在
        } catch (DataAccessException e) {
            //返回null值
            return null;
        }
    }
}
