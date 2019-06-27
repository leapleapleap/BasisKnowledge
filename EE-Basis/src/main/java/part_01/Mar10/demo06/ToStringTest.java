package part_01.Mar10.demo06;
@SuppressWarnings("all")
public class ToStringTest {
    static int i= 1;

    public static void main(String args[]){
        System.out.println("love " + new ToStringTest());//love java  默认调用该对象的toString方法
        ToStringTest a = new ToStringTest();
        a.i++;//i=2

        System.out.println("me " + a.i);//me 2
    }

    @Override
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }
}
