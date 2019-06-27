package part_01.Mar10.demo03;

/*  匿名内部类的应用  */

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Cat c = new Cat();
        jo.useJumpping(c);

        Dog d = new Dog();
        jo.useJumpping(d);

        System.out.println("----------------");

        //匿名内部类可以减少类的创建，对于只使用一次的类而言，
        //没有用标识符标记的必要，使用匿名内部类大大提升了效率
        jo.useJumpping(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });

        jo.useJumpping(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });

    }
}
