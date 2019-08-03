package part_03.Apr01.demo06;

//枚举类
public enum Person {

    P1,P2,P3
}

//通过编译反编译获得以下的最终类定义，其中的对象都为静态的、最终的对象
/*  Compiled from "Person.java"
    public final class Person extends java.lang.Enum<Person> {
        public static final Person P1;
        public static final Person P2;
        public static final Person P3;
        public static Person[] values();
        public static Person valueOf(java.lang.String);
        static {};
    }   */