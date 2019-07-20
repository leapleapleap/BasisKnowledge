package part_01.Mar17.demo03;

import java.util.HashMap;

@SuppressWarnings("all")
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);// key不允许重复,无序 {a=d, b=b, c=c}

        java.util.LinkedHashMap<String, String> linked = new java.util.LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked);// key不允许重复,有序 {a=d, c=c, b=b}
    }
}

