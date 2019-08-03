package part_03.Apr01.demo02;

public class ReflectDemo01_Obtain_Class {


    /**
     * 获取Class对象的方式：
     * 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
     * 2. 类名.class：通过类名的属性class获取
     * 3. 对象.getClass()：getClass()方法在Object类中定义着。
     */
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {


        //1.Class.forName("全类名")
        Class cls1 = Class.forName("part_03.Apr01.demo02.Person");
        System.out.println(cls1);

        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        Person p2 = new Person();
        Class cls4 = p2.getClass();

        //== 比较三个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true


        Class c = Student.class;
        System.out.println(c == cls1);


    }
}
