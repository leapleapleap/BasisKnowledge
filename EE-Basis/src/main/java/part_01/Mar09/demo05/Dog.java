package part_01.Mar09.demo05;
/*
    定义狗类继承动物类
		行为:
			eat(String something)方法,看家lookHome方法(无参数)
 */
public class Dog extends Animal{

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗吃"+something);
    }

    //子类特有方法
    public void lookHome(){
        System.out.println("狗看家");
    }
}
