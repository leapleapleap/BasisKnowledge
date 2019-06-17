package Feb._19_20;

public class Demo03_operation {
    public static void main(String[] args) {
        double d = 10 + 13.14;
        System.out.println(d);
        System.out.println("-------------");
        //算数运算符的练习
        int num1=10;
        int num2=20;

        System.out.println(num1+num2);//加+
        System.out.println(num1-num2);//减-
        System.out.println(num1*num2);//乘*
        System.out.println(num1/num2);//除/
        System.out.println(num1%num2);//取余（模）%
        System.out.println("-------------");
        //字符串的拼接练习
        System.out.println(111+"容光焕发"+666+"天王盖地虎"+666);
        System.out.println(8+8+"-"+8+8);

        System.out.println("-------------");
        int aa=5;
        int bb=5;
        System.out.println(aa+"+"+bb+"="+(aa+bb));//小括号提升优先级

        System.out.println("-------------");
        //赋值运算符
        //基本赋值运算符  =
        int i=10;
        System.out.println("i："+i);

        //扩展的赋值运算符

        //+=
        i+=10;  //i=i+10;
        System.out.println("i："+i);

        short s = 10;
        s+=10;	  //扩展的赋值运算符底层隐含了强制类型转换
        //s=s+10; //错误写法！
        s=(short)(s+10); // 正确写法
        System.out.println("s："+s);//30

        //-=
        i-=5;
        System.out.println("i："+i);//15

        //自增自减运算符  ++  --
        System.out.println(i++);	//15
        System.out.println(i);		//16
    }
}
