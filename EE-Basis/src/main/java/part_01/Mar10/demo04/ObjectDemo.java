package part_01.Mar10.demo04;

@SuppressWarnings("all")
public class ObjectDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);

        //toString方法重写后的输出结果为：
        System.out.println(s1);     //Student{name='林青霞', age=30}
        System.out.println(s2);     //Student{name='林青霞', age=30}

        System.out.println(s1.equals(s2));      //true
    }
}
