package part_01.Mar14.demo05;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);
    }

    //通配符的使用
    private static void printArray(ArrayList<?> e){
        Iterator<?> iterator = e.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
