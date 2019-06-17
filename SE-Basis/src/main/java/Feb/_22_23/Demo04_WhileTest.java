package Feb._22_23;

/*   珠穆朗玛峰练习：
        世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
        假如有一张足够大的纸，它的厚度为0.1毫米，请问：
        折叠多少次，可以超过珠峰的高度？    */
public class Demo04_WhileTest {
    public static void main(String[] args) {
        double paper = 0.1;
        int zf = 8844430;         //珠峰高度
        int count = 0;          //计数器
        while (paper <= zf) {
            paper *= 2;
            count++;
        }
        System.out.println("折叠了：" + count + "次!!!");
    }
}
