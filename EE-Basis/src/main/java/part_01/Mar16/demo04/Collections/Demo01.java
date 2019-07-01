package part_01.Mar16.demo04.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*  java.utils.Collections是集合工具类，用来对集合进行操作  */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //boolean addAll(Collection<T> c, T... elements)
        //往集合中添加一些元素
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        //shuffle(List<?> list)
        //打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
