package part_01.Mar16.demo04.Collections;

//实现Comparable接口并指定泛型的类型
public class Demo02_person implements Comparable<Demo02_person>{
    private String name;
    private int age;

    //无参构造方法
    public Demo02_person() {
    }

    //全参构造方法
    public Demo02_person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Demo02_person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Getter & Setter
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

    //重写排序的规则
    @Override
    public int compareTo(Demo02_person o) {
        //return 0;//认为元素都是相同的
        //自定义比较的规则,比较两个人的年龄(this,参数Person)
        //return this.getAge() - o.getAge();//年龄升序排序
        return o.getAge() - this.getAge();//年龄降序排序
    }
}
