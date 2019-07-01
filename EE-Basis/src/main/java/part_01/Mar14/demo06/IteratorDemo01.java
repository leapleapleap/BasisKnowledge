package part_01.Mar14.demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*  java.util.Iterator接口:迭代器(对集合进行遍历)
    有两个常用的方法
        boolean hasNext():如果仍有元素可以迭代(还有没有下一个元素),则返回true;否则就返回false
        E next() 返回迭代的下一个元素(取出集合中的下一个元素)

    Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象

    获取实现类的方式比较特殊
    Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器

    迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素   */

public class IteratorDemo01 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");

        /*  1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
            注意:
                Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型   */

        Iterator<String> it = coll.iterator();


        /*  发现使用迭代器取出集合中元素的代码,是一个重复的过程
            所以我们可以使用循环优化
            不知道集合中有多少元素,使用while循环
            循环结束的条件,hasNext方法返回false    */

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------");

        /*  for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
                String e = it2.next();
                System.out.println(e);
            }   */
    }
}