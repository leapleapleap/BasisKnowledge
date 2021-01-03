package part_06.April29_EL_JSTL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String name;
    private Date birthday;

    //逻辑视图：没有对应的变量，只用作数据的美化展示操作
    public String getDateLocal(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
