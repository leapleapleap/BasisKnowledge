package part_01.Mar17.demo10;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //使用List的静态方法of()创建不可变集合
        //List<String> list1 = List.of("黑龙江省", "浙江省", "江西省", "广东省", "福建省");
        //List<String> list2 = List.of("哈尔滨", "杭州", "南昌", "广州", "福州");

        //使用Collections工具类的方法
        //public static <T> boolean addAll(Collection<? super T> c, T... elements)
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"黑龙江省", "浙江省", "江西省", "广东省", "福建省");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"哈尔滨", "杭州", "南昌", "广州", "福州");

        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i),list2.get(i));
        }

        /*  Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                System.out.println(entry.getKey()+"--->"+entry.getValue());
            }   */

        //创建保存所有键的Set集合
        Set<String> keySet = map.keySet();

        //增强for循环输出键值对内容
        /*  for (String s : keySet) {
                System.out.println(s+"--->"+map.get(s));
            }   */

        //使用迭代器遍历输出键值对内容
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next+"--->"+map.get(next));
        }
    }
}
