package part_06.April29_EL_JSTL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String age;
    private Date birthday;

    public Student() {
    }

    public Student(String name, String age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //逻辑视图：没有对应的变量，只用作数据的美化展示操作
    public String getDateLocal(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(birthday);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
