package part_03.Mar31.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 需求：
 * 	  1.只使用前7个元素；
 * 	  2.跳过第一个元素；
 * 	  3.只留下女的；
 * 	  4.只留下年龄小于33的；
 * 	  5.每个字符串映射成一个User对象；
 * 	  6.把数据收集到集合中；
 * 	  7.遍历集合，输出内容；
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("柳岩,女,18");
        list.add("柳传志,男,21");
        list.add("关晓彤,女,19");
        list.add("凤姐,女,22");
        list.add("鹿晗,男,25");
        list.add("李若彤,女,33");
        list.add("闫妮,女,44");
        list.add("吴孟达,男,55");

        /*
        list.stream_method()
                .limit(7)
                .skip(1)
                .filter(s -> s.split(",")[1].equals("女"))
                .filter(s -> Integer.parseInt(s.split(",")[2]) < 33)
                .map(s -> {
                    String[] split = s.split(",");
                    return new User(split[0], split[1], Integer.parseInt(split[2]));
                })
                .forEach(System.out::println);*/
        ArrayList<User> arr = list.stream()
                .limit(7)
                .skip(1)
                .filter(s -> s.split(",")[1].equals("女"))
                .filter(s -> Integer.parseInt(s.split(",")[2]) < 33)
                .map(s -> {
                    String[] split = s.split(",");
                    return new User(split[0], split[1], Integer.parseInt(split[2]));
                }).collect(Collectors.toCollection(ArrayList::new));
        for (User user : arr) {
            System.out.println(user);
        }


    }
}
