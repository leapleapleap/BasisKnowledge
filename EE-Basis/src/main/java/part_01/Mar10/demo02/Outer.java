package part_01.Mar10.demo02;

public class Outer {
    //成员方法
    private int num = 10;

    //成员内部类
    private class Inner {
        //内部类成员变量
        private String name;
        private int age;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //内部类方法
        public void show() {
            System.out.println(num);
        }

    }

    //私有内部类的访问方法
    public void innerShow() {
        //调用内部类的无参构造器
        Inner i = new Inner();
        i.show();
    }

    //私有内部类访问方法的重载
    public void innerShow(String name, int age) {
        //调用内部类的带参构造器
        Inner i = new Inner(name, age);
        System.out.println(i.getName() + "," + i.getAge());
    }
}
