package part_01.Mar10.demo04;

@SuppressWarnings("all")
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //实例方法
    @Override
    public boolean equals(Object o) {
        //如果是同一个对象(== 比较的是地址)
        if (this == o) return true;
        //如果对象不存在或者对象的类型和调用方法的类型不同
        if (o == null || getClass() != o.getClass()) return false;

        //将待比较的对象强制类型转换为调用方法的对象的类型
        Student student = (Student) o;

        //如果对象的属性不同
        if (age != student.age) return false;
        //当name不为null时----->调用方法的对象姓名属性和比较对象的姓名属性相同时为true
        return name != null ? name.equals(student.name) : student.name == null;
    }
}

