package part_03.Mar26.demo08;

import java.io.*;

@SuppressWarnings("all")
public class Demo01Test {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\ZY\\Desktop\\1.jpg");
        FileOutputStream fos= new FileOutputStream("C:\\Users\\ZY\\Desktop\\2.jpg");

        int len = 0;
        /*while ((len = fis.read())!=-1){
            fos.write(len);
        }*/
        //20937

        /*byte[] arr = new byte[1024];
        while ((len = fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }*/
        //62


        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos= new BufferedOutputStream(fos);

        /*while ((len = bis.read())!=-1){
            bos.write(len);
        }*/
        //94

        byte[] arr = new byte[1024];
        while ((len = bis.read(arr))!=-1){
            bos.write(arr,0,len);
        }
        //47

        //BufferedInputStream or BufferedOutputStream 在调用close方法时会默认调用关闭对应的FileInputStream和FileOutputStream
        bos.close();
        bis.close();
        /*fos.close();
        fis.close();*/

        long end = System.currentTimeMillis();
        System.out.println(end-start);


    }
}
