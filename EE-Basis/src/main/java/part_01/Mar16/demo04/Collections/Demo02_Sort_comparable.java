package part_01.Mar16.demo04.Collections;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("all")
/*  void sort(List<T> list):将集合中元素按照默认规则排序
    sort(List<T> list)使用前提:
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则  */
public class Demo02_Sort_comparable {
    public static void main(String[] args) {
        ArrayList<Demo02_person> list03 = new ArrayList<>();
        list03.add(new Demo02_person("张三",18));
        list03.add(new Demo02_person("李四",20));
        list03.add(new Demo02_person("王五",15));
        System.out.println(list03);
        //输出顺序依赖于自定义类实现接口时重写compareTo方法中的比较规则
        Collections.sort(list03);
        System.out.println(list03);
    }
}
