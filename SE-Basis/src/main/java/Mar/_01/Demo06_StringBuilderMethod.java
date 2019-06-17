package Mar._01;

public class Demo06_StringBuilderMethod {
    public static void main(String[] args) {
        /*
            indexOf
            lastIndexOf
         */
        String s1 = "abcdefghijk";
        //indexOf,如果指定字符存在，则返回首次出现位置的索引值
        int index1 = s1.indexOf('e');
        System.out.println(index1);

        //如果指定字符卷不存在，则返回-1
        int index2 = s1.indexOf('z');
        System.out.println(index2);

        //lastIndexOf：从后往前，目标字符串出现的索引位置
        int index3 = s1.lastIndexOf('i');
        System.out.println(index3);

        /*
            isEmpty
            trim
         */
        //是否为空isEmpty
        String s2 = "abc";
        boolean isEmpty = s2.isEmpty();
        System.out.println(isEmpty);

        //trim
        String s3 = " China Navy ";
        System.out.println(s3.length());
        String newStr = s3.trim();
        System.out.println(newStr.length());
        System.out.println("old:"+s3);
        System.out.println("new:"+newStr);

        /*
            substring
         */
        String s4 = "abcd";
        //从beginIndex索引位置开始，到endIndex索引位置结束 --->  [ , )
        String substring1 = s4.substring(1, 3);
        //从指定索引位置开始，到字符串的结束
        String substring2 = s4.substring(2);

        /*
            toUpperCase
	        toLowerCase
         */

        String str = "abc";

        String str1 = str.toUpperCase();
        String str2 = str1.toLowerCase();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        /*
            toCharArray
         */

        //s4 ---> "abcd";
        char[] ch = s4.toCharArray();

        /*
            循环遍历
                增强for循环,  foreach循环
                for(数据类型 变量名:要遍历的数组){
                    sout(变量名);
                }

                //数据类型要和数组的数据类型匹配
         */
        for (char c : ch) {
            System.out.print(c + "\t");
        }

        System.out.println();
        /*
            endsWith
            startsWith
         */
        //是否已目标字符串结尾
        boolean a = s4.endsWith("d");
        //是否以目标字符串开头
        boolean b = s4.startsWith("a");
        System.out.println(a);
        System.out.println(b);

        /*
            replace
            split
         */
        String s5 = "我跟你";

        String s5_1 = s5.replace('跟', '和');
        System.out.println(s5_1);
        String s5_2 = s5.replace("跟", "很爱很爱");
        System.out.println(s5_2);

        /*
                分割方法split
                英文的点在做分割的时候比较特殊
                如果要用英文的点在做分割，需要转意，加两个 "\\"
         */
        String st1 = "我,和,你";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String st2 = "我.和.你";
        String[] split1 = str1.split("\\.");//正则表达式
        for (String s : split1) {
            System.out.println(s);
        }
    }
}
