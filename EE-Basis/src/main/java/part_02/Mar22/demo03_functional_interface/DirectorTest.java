package part_02.Mar22.demo03_functional_interface;
/*  测试类 */
public class DirectorTest {
    public static void main(String[] args) {
        //使用Lambda表达式
        getMovie(()-> System.out.println("战狼3"));
    }

    //调用方法，参数类型为接口
    public static void getMovie(Director d){
        d.makeMovie();
    }
}
