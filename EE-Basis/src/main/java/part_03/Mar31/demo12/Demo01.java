package part_03.Mar31.demo12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
/*  延迟方法：
        filter      --->Stream<T> Predicate<? super T> predicate
        map         --->Stream<R> Function<? super T, ? extends R> mapper
        skip        --->Stream<T> skip(long n)
        limit       --->Stream<T> limit(long maxSize)
    终结方法：
        count       --->long count()
        forEach     --->void forEach(Consumer<? super T> action)
        collect     */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<>();
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tony", 23);
        Person p3 = new Person("Jany", 17);
        Person p4 = new Person("Cun", 31);
        Person p5 = new Person("Yun", 36);

        Collections.addAll(arr, p1, p2);
//        arr.add(p1);
//        arr.add(p2);
//        arr.add(p3);
//        arr.add(p4);
//        arr.add(p5);

        //集合调用Collection类的stream方法生成流对象
        Stream<Person> stream = arr.stream();
        //Stream<Person> tradition_stream = Stream.of(p1, p2, p3, p4, p5);
        //数组使用Stream对象的of方法生成流对象
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");
        Stream<String> stream3 = Stream.of("6", "7", "8", "9", "10");

        //调用Stream的静态方法concat对两个流对象进行拼接
//        Stream<String> concat = Stream.concat(stream2, stream3);
        //流对象的链式编程
        //stream2.limit(6).forEach(s-> System.out.print(s));//12345


        /*
        Set<String> collectSet = stream2.collect(Collectors.toSet());
        for (String s : collectSet) {
            System.out.print(s);
        }
        */

        /*
        List<String> collectList = stream3.collect(Collectors.toList());
        for (String s : collectList) {
            System.out.print(s);
        }
        */

        //将流对象可操作的数据收集到数组中
        //先把数据收集到集合中，再把集合转换成数组
        ArrayList<String> collect = stream2.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);

        Collection<String> collection = stream3.collect(Collectors.toCollection(() -> new ArrayList<>()));

        //Stream<Integer> integerStream = stream2.map((String s) -> Integer.parseInt(s));

        /*
        tradition_stream.filter(person -> person.getAge() > 30)
                .forEach(person -> System.out.println(person.getName() + "=" + person.getAge()));
        */

        //Stream<T> filter(Predicate<? super T> predicate);
        //filter方法的参数需要传递-->判断型函数式接口Predicate的Lambda表达式方法
        /*
        tradition_stream.filter(person -> person.getName().startsWith("T"))
                .filter(person -> person.getAge()>20&&person.getAge()<30)
                .forEach(person -> System.out.println(person.getName()+"="+person.getAge()));
        */

        stream.filter(person -> person.getName().contains("n"))
                .forEach(person -> System.out.println(person.getName() + "=" + person.getAge()));

        /*
        long count = tradition_stream.count();
        System.out.println(count);
        */

        //tradition_stream.skip(2).forEach(p-> System.out.println(p));
        //tradition_stream.forEach(p-> System.out.println(p));
        //tradition_stream.limit(3).forEach(p-> System.out.println(p));
    }
}
