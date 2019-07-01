package part_01.Mar16.demo03.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressWarnings("all")
/*  java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),
        保证元素有序  */
public class Demo04_LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//[abc, www, itcast] 无序,不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("itcast");
        linked.add("abc");
        System.out.println(linked);//[www, abc, itcast] 有序,不允许重复

        Iterator<String> iterator = linked.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
