package part_01.Mar14.demo02;

public class GenericDemo {
    public static void main(String[] args) {

        GenericClass<Integer> g1 = new GenericClass<>();
        g1.setName(1);
        Integer name = g1.getName();
        System.out.println(name);

        GenericClass<String> g2 = new GenericClass<>();
        g2.setName("花花公子");
        String name1 = g2.getName();
        System.out.println(name1);
    }

}
