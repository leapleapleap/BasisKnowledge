package part_01.Mar14.demo05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement1(list1);
        //getElement1(list2); //报错(String don't extends Number)
        getElement1(list3);
        //getElement1(list4); //报错(Object don't extends Number)
        //getElement2(list1); //报错(Integer don't super Number)
        //getElement2(list2); //报错(String don't super Number)
        getElement2(list3);
        getElement2(list4);
    }
    private static void getElement1(Collection <? extends Number> coll ){
        Iterator<? extends Number> iterator = coll.iterator();
        while(iterator.hasNext()){
            Number next = iterator.next();
            System.out.println(next);
        }
    }
    private static void getElement2(Collection <? super Number> coll ){
        Iterator<? super Number> iterator = coll.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
