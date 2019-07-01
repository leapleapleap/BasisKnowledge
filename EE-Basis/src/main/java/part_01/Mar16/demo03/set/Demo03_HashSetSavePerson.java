package part_01.Mar16.demo03.set;

import java.util.HashSet;

/*  HashSet存储自定义类型元素

    set集合保存元素唯一:
        存储的元素(String,Integer,...Student,Demo02_person...),
        必须重写hashCode方法和equals方法
    要求:
        同名同年龄的人,视为同一个人,只能存储一次   */
public class Demo03_HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女",18);
        Person p2 = new Person("小美女",18);
        Person p3 = new Person("小美女",19);
        //重写hashCode()方法之后，通过Person对象的name和age得到的hash值如下
        System.out.println(p1.hashCode());//734175839
        System.out.println(p2.hashCode());//734175839

        //“==”比较地址值
        System.out.println(p1==p2);//false
        //在不重写equals()方法前，引用类型调用equals方法比较的是地址值,但是
        //在重写equals方法之后比较的是引用变量的指定内容
        System.out.println(p1.equals(p2));//true
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        //[Demo02_person{name='小美女', age=19}, Demo02_person{name='小美女', age=18}]
    }
}
