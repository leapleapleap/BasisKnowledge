package part_04.Apr09_datasource_JDBCTemplate.demo05;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("username","王麻子");
        map.put("age","18");
        map.put("gender","女");
        map.put("address","陕西西安");
        map.put("phone","120");

        //User user = PopulateUtils.populateUser(map);
        //System.out.println(user);

        //Student student = PopulateUtils.populateStudent(map);
        //System.out.println(student);
        try {
            Student student = (Student)PopulateUtils.populate(map,Student.class);
            System.out.println(student);
            User user = PopulateUtils.populate(map, User.class);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
