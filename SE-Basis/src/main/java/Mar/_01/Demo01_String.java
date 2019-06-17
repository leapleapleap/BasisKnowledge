package Mar._01;

public class Demo01_String {
    public static void main(String[] args) {
        //String无参构造，生成空字符串
        String s1 = new String();

        //参数为字符数组的有参构造，生成相应内容的字符串
        char[] ch = {'a', 'b', 'c'};
        //String(char value[])
        String s2 = new String(ch);

        //参数为字节数组的有参构造，生成相应内容的字符串
        byte[] b = {97, 98, 99};
        //String(byte bytes[])
        String s3 = new String(b);

        //直接赋值创建字符串
        String s4 = "abc";

        char[] ch2 = {'a','b','c','d','e','f','g','h'};
        //String(char value[], int offset, int count)
        String s5 = new String(ch2, 0, 8);

        byte[] b2 = {48, 49, 50, 65, 66, 67, 97, 98, 99};
        //String(byte bytes[], int offset, int length)
        String s6 = new String(b2, 0, 9);

        //indexOf方法:返回字符在数组中的索引
        int num = s4.indexOf("c");

        //substring方法----> [int beginIndex, int endIndex)
        //substring(int beginIndex, int endIndex)
        String substring = s5.substring(2, 8);
    }
}
