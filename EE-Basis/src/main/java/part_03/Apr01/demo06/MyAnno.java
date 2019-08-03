package part_03.Apr01.demo06;

//定义一个注解
public @interface MyAnno {

    //属性可以是基本数据类型、字符串、枚举、注解、及其对应的数组
    int value();

    //枚举类
    Person per();

    //注解
    MyAnno2 anno2();

    //数组
    String[] strs();

    //可以在定义抽象方法同时赋值，格式如下
    String name() default "张三";



}
