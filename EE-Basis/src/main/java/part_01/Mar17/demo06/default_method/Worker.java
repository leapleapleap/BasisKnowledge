package part_01.Mar17.demo06.default_method;

public class Worker implements Human {

    @Override
    public void eat() {
        System.out.println("工人吃馒头烩菜");
    }

    @Override
    public void drink() {
        System.out.println("工人咕噜咕噜喝水");
    }
}
