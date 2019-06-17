package Mar._03_04;

/*  ArrayList常用方法：
        public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        public E get(int index)：返回指定索引处的元素
        public int size()：返回集合中的元素的个数
        public boolean addAll(Collection<? extends E> c)
        public boolean addAll(int index, Collection<? extends E> c)     */

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //removeTest(array);
        //removeByIndexTest(array);
        //setTest(array);
        //System.out.println(getTest(array));
        //System.out.println(sizeTest(array));
        //addAllTest(array);
        addAllWithIndexTest(array);

        //System.out.println(array.toString());
    }
    /*public boolean addAll(int index, Collection<? extends E> c)*/
    private static void addAllWithIndexTest(ArrayList<String> arrayOld){
        ArrayList<String> array = new ArrayList<>();
        array.add("aaa");
        array.add("bbb");
        array.add("ccc");
        array.addAll(2,arrayOld);
        System.out.println(array.toString());
    }

    /*public boolean addAll(Collection<? extends E> c)*/
    private static void addAllTest(ArrayList<String> arrayOld){
        ArrayList<String> array = new ArrayList<>();
        array.addAll(arrayOld);
        System.out.println(array.toString());
    }

    /*public int size()：返回集合中的元素的个数*/
    private static Integer sizeTest(ArrayList<String> array){
        return array.size();
    }

    /*public E get(int index)：返回指定索引处的元素*/
    private static String getTest(List array){
        return (String) array.get(1);   //超出集合索引范围会报 IndexOutOfBoundsException 异常
    }

    /*public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素*/
    private static void setTest(ArrayList<String> array){
        array.set(1,"javaEE");  //超出集合索引范围会报 IndexOutOfBoundsException 异常
    }

    /*public E remove(int index)：删除指定索引处的元素，返回被删除的元素*/
    private static void removeByIndexTest(List array){
        array.remove(2);    //超出集合索引范围会报 IndexOutOfBoundsException 异常
    }


    /*public boolean remove(Object o)：删除指定的元素，返回删除是否成功*/
    private static void removeTest(List array){
        array.remove("world");
    }



}
