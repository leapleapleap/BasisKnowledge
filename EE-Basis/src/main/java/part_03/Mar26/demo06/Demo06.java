package part_03.Mar26.demo06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06 {

    //通过往文本中添加元素，通过元素的个数判断来判断使用次数
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JavaEE_basis\\1.txt");
        FileOutputStream fos= new FileOutputStream("JavaEE_basis\\1.txt",true);

        byte[] arr = new byte[1024];
        int len = fis.read(arr);
        if(len==-1){
            fos.write('a');
            fos.flush();
        }
        fos.close();
        fis.close();
        fis = new FileInputStream("JavaEE_basis\\1.txt");
        fos= new FileOutputStream("JavaEE_basis\\1.txt",true);
        if (len <= 3) {
            System.out.println("欢迎使用本软件,第" + len + "次使用免费~");

            fos.write('a');
            fos.close();
        } else {
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        }
        fos.close();
    }
}
