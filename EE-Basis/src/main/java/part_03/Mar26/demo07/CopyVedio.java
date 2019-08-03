package part_03.Mar26.demo07;

import java.io.*;
import java.util.Scanner;

@SuppressWarnings("all")
public class CopyVedio {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小视频的路径：");
        String s = sc.nextLine();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s));
        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("D:\\1.avi"));

        /*
            125MB
         */
        //24584
        /*int len = 0;

        while((len = bis.read())!=-1){
            bos.write(len);
        }*/

        //4084
        int len = 0;
        byte[] arr = new byte[1024];
        while((len = bis.read(arr))!=-1){
            bos.write(arr,0,len);
        }

        bos.close();
        bis.close();
        long end = System.currentTimeMillis();

        System.out.println("共耗时："+(end-start));
    }
}
