package part_01.Mar08.demo03;

/*  Phone类为父类，NewPhone为子类   */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("张曼玉");

        System.out.println("--------");

        NewPhone np = new NewPhone();
        np.call("张曼玉");
    }
}
