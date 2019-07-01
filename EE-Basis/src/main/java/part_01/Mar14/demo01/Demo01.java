package part_01.Mar14.demo01;

/*  java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法
    方法:
      public boolean add(E e)       把给定的对象添加到当前集合中
      public void clear()           清空集合中所有的元素
      public boolean remove(E e)    把给定的对象在当前集合中删除
      public boolean contains(E e)  判断当前集合中是否包含给定的对象
      public boolean isEmpty()      判断当前集合是否为空
      public int size()             返回集合中元素的个数
      public Object[] toArray()     把集合中的元素，存储到数组中  */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("all")
public class Demo01 {

    public static void main(String[] args) {
        Collection<String> listArray = new ArrayList<>();
        Collection<String> setArray = new HashSet<>();
        //test01(listArray);
        //test02(listArray);
        //test03(setArray);
        //test04(listArray);
        //test05(listArray);
        //test06(listArray);
        test07(listArray);
    }

    //  public boolean add(E e)
    //  把给定的对象添加到当前集合中(返回值是一个boolean值,一般都返回true,所以可以不用接收)
    private static void test01(Collection<String> listArray){
        boolean flag = listArray.add("张三");
        System.out.println(flag);
        System.out.println(listArray); //重写了toString方法 []
    }

    //TODO!!!  List：存取有序、元素可重复
    private static void test02(Collection<String> listArray){
        listArray.add("张三");
        listArray.add("李四");
        listArray.add("李四");
        listArray.add("王五");
        listArray.add("王五");
        listArray.add("王五");
        listArray.add("赵六");
        System.out.println(listArray); //[张三, 李四, 李四, 王五, 王五, 王五, 赵六]
    }

    //TODO!!!  Set：存取无序、元素不可重复
    private static void test03(Collection<String> setArray) {
        setArray.add("tom");
        setArray.add("jack");
        setArray.add("jack");
        setArray.add("lucy");
        setArray.add("lucy");
        setArray.add("lucy");
        setArray.add("herry");
        System.out.println(setArray);   //[tom, herry, lucy, jack]
    }

    // public boolean remove(E e)
    // 把给定的对象在当前集合中删除:返回值是一个boolean值,集合中存在元素,删除元素,返回true
    // 集合中不存在元素,删除失败,返回false
    private static void test04(Collection<String> listArray){
        test02(listArray);
        System.out.println("remove 王五:"+listArray.remove("王五"));
        System.out.println("remove 李四:"+listArray.remove("李四"));
        System.out.println(listArray);
    }

    // public boolean contains(E e)
    // 判断当前集合中是否包含给定的对象:   包含返回true,不包含返回false
    private static void test05(Collection<String> listArray){
        test02(listArray);
        System.out.println("contains 李四:"+ listArray.contains("李四"));
        System.out.println("contains 赵四:"+ listArray.contains("赵四"));
    }

    // public boolean isEmpty()    判断当前集合是否为空,集合为空返回true,集合不为空返回false
    // public int size()           返回集合中元素的个数
    //public void clear()          清空集合中所有的元素。不删除集合,集合仍然存在
    private static void test06(Collection<String> listArray){
        test02(listArray);
        System.out.println("isEmpty:"+ listArray.isEmpty());
        System.out.println("size:"+ listArray.size());
        listArray.clear();
        System.out.println("clear后:"+listArray);
    }

    //public Object[] toArray(): 把集合中的元素，存储到数组中
    private static void test07(Collection<String> listArray){
        test02(listArray);
        Object[] listStr = listArray.toArray();
        for (Object s : listStr) {
            System.out.print(s+"   ");
        }
    }
}
