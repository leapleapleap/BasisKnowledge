package part_03.Apr01.demo04;

/**
 * 注解javadoc演示
 *
 * @author itcat
 * @version 1.0
 * @since 1.5
 */
/*  注解抽出到文档的方法
        1.将需要抽出文档的类复制到桌面并且删除其中的导包操作
        2.在命令提示符中输入javadoc Xxx.java   */
public class GenDocTest {

    /**
     * 计算两数的和
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */
    public int add(int a, int b ){
        return a + b;
    }
}
