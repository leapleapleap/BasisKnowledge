package part_03.Mar23.demo02;

public class Demo02Recursion {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);

        int i = jc(5);
        System.out.println(i);
    }

    /*  定义一个方法,使用递归计算1-n之间的和
        1+2+3+...+n
        n+(n-1)+(n-2)+...+1
        已知:
            最大值:n
            最小值:1
        使用递归必须明确:
            1.递归的结束条件
                获取到1的时候结束
            2.递归的目的
                获取下一个被加的数字(n-1)  */
    private static int sum(int n){
        //获取到1的时候结束
        if(n==1){
            return 1;
        }
        //获取下一个被加的数字(n-1)
        return n + sum(n-1);
    }


    /*  定义方法使用递归计算阶乘
        5的阶乘: 5! = 5*(5-1)*(5-2)*(5-3)*(5-4)=5*4*3*2*1
        递归结束的条件
            获取到1的时候结束
        递归的目的
            获取下一个被乘的数字(n-1)
        方法的参数发生变化
            5,4,3,2,1    */
    public static int jc(int n) {
        //获取到1的时候结束
        if (n == 1) {
            return 1;
        }
        //获取下一个被乘的数字(n-1)
        return n * jc(n - 1);
    }
}
