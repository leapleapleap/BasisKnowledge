package part_03.Mar23.demo04;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\CloudMusic\\a.txt");
        System.out.println(f1.createNewFile());//true
        //文件夹中如果已经存在同名的文件则不能再创建该文件
//        File f2 = new File("D:\\CloudMusic\\a.txt");
//        System.out.println(f2.createNewFile());//false

        File f2 = new File("D:\\CloudMusic\\111\222");
        //public boolean mkdirs() --->创建单级或者多级目录
        System.out.println(f2.mkdirs());//true
        //public boolean mkdir() --->创建单级目录
        System.out.println(f2.mkdir());//false
        System.out.println(f2.delete());//true
        System.out.println(f1.delete());//true

        //若删除的文件或者目录路径不存在则返回false
        System.out.println(f1.delete());//false
        File f3 = new File("D:\\CloudMusic");
        //文件夹不为空是删除操作返回false
        System.out.println(f3.delete());//false
    }
}
