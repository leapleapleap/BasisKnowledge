package part_01.Mar14.demo06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo02 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();

        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("赵六");
        c.add("田七");

        Iterator<String> iterator = c.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        //功能更加强大，可以在迭代过程中做一些操作
        ListIterator<String> lit = c.listIterator();
//        c.add("王麻子");//ConcurrentModificationException
        lit.add("王麻子");//添加到光标的前面
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
            if(s.equals("张三")) {
                lit.remove();//移除
            }
        }
        System.out.println(c);
    }
}
