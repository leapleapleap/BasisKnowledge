package part_02.Mar22.demo03_functional_interface;

public class CookTest {
    public static void main(String[] args) {
        useCook(() -> System.out.println("红烧鲤鱼！"));
    }

    public static void useCook(Cook cook) {
        cook.makeFood();
    }
}
