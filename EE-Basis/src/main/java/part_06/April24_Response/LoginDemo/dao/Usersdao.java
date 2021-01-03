package part_06.April24_Response.LoginDemo.dao;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import part_06.April24_Response.LoginDemo.domain.User;
import part_06.April24_Response.LoginDemo.utils.JDBCUtils;

/**
 * 操作数据库的类
 */
public class Usersdao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public User login(User loginUser){
        try {
            String sql = "select * from users where username = ? and password = ?";
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            return null;
        }
    }
}
