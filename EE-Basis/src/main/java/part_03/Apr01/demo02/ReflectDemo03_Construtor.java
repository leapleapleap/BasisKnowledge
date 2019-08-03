package part_03.Apr01.demo02;

import java.lang.reflect.Constructor;

@SuppressWarnings("all")
public class ReflectDemo03_Construtor {


    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*  2. 获取构造方法们
                 * Constructor<?>[] getConstructors()
                 * Constructor<T> getConstructor(类<?>... parameterTypes)

                 * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
                 * Constructor<?>[] getDeclaredConstructors()   */


        //Constructor<T> getConstructor(类<?>... parameterTypes)

        /*  getConstructor 是通过参数列表的类型来确定一个具体的构造方法，所以getConstructor要传入的参数
        不是具体的数值，而是类型，我们使用类型的名称.class 来代表类型  */

        //获取某类的带参构造器，其参数处传递相应类型的class对象
        Constructor constructor1 = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);
        Constructor constructor2 = personClass.getConstructor();
        //getConstructors获取指定类的所有public修饰的构造器，包括无参构造器和带参构造器
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor cons : constructors) {
            System.out.println(cons);
        }

        //创建对象
        /*  newInstance方法是运行这个构造方法，运行的时候传入的实际的数据，实际数据的类型
        要和getConstructor中的“类型”对应，如果getConstructor没有类型，我们拿到的就是一
        个空参数的构造方法，那么运行这个构造方法的时候也就什么数据也不传入   */

        Object o1 = constructor1.newInstance("张三", 18);
        Object o2 = constructor2.newInstance();

        System.out.println(o1);
        System.out.println(o2);

        //personClass.newInstance()是获取空参构造方法对象并实例化本类对象的语法糖
        //这样实例化对象和上面的原理是一样的只是可以简化代码，但是有限性（当我们想去使用空参构造创建对象才能这么去简化代码）
        Object o = personClass.newInstance();
        System.out.println(o);
    }


}
