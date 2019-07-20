package part_02.Mar20.demo13;
/*
    (1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个
	    数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
	(4)最终打印该数组中对称字符串的个数。

 */
public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"010","3223","666","7890987","123123"};
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();

            for (int j = 0; j <= sb.length()/2; j++) {

                /*
                if(sb.charAt(j) != reverse.charAt(j)){
                    System.out.println(sb+"是不对称的字符串");
                }else{
                    System.out.println(sb+"是对称的字符串");
                }
                */
                char c1 = sb.charAt(j);
                char c2 = arr[i].charAt(j);
                if(c1!=c2){
                    System.out.println(arr[i]+"是不对称的字符串");
                    break;
                }else if(j == sb.length()/2){
                    System.out.println(arr[i]+"是对称的字符串");
                }
            }

        }


    }
}
