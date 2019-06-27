package part_01.Mar08.demo03;

public class NewPhone extends Phone {
    //重写父类方法
    @Override
    public void call(String name) {
        System.out.println("开启视频功能");
        //调用父类方法
        super.call(name);
    }
}
