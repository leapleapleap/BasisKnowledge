package part_03.Mar23.demo04;

import java.io.File;

@SuppressWarnings("all")
public class Test01 {
    public static void main(String[] args) {
        String pathname = "D:\\aaa.txt";
        File file1 = new File(pathname);
        //可执行
        boolean b = file1.canExecute();
        //<code>true</code> if and only if the abstract pathname exists
        // and the application is allowed to execute the file

        //可读
        boolean c = file1.canRead();
        //<code>true</code> if and only if the file specified by this
        // abstract pathname exists and can be read by the application;
        // <code>false</code> otherwise

        //可写
        boolean a = file1.canWrite();
        //<code>true</code> if and only if the file system actually contains
        // a file denoted by this abstract pathname <em>and</em> the
        // application is allowed to write to the file; <code>false</code> otherwise.

        //判断是否是文件夹
        boolean directory = file1.isDirectory();
        //Tests whether the file denoted by this abstract pathname is a directory.

        //判断文件路径是否是绝对路径
        boolean absolute = file1.isAbsolute();
        //Tests whether this abstract pathname is absolute.

        //判断该File是否为文件
        boolean file = file1.isFile();
        //Tests whether the file denoted by this abstract pathname is a normal file.
        // A file is <em>normal</em> if it is not a directory and, in addition,
        // satisfies other system-dependent criteria.

        //判断该File是否隐藏
        boolean hidden = file1.isHidden();
        //Tests whether the file named by this abstract pathname is a hidden file.

        //获取该文件的长度
        long length = file1.length();
        //Returns the length of the file denoted by this abstract pathname.
        // The return value is unspecified if this pathname denotes a directory.

        //创建单层文件夹
        boolean mkdir = file1.mkdir();
        //创建多层文件夹
        boolean mkdirs = file1.mkdirs();
        //Creates the directory named by this abstract pathname, including any
        // necessary but nonexistent parent directories.  Note that if this
        // operation fails it may have succeeded in creating some of the necessary
        // parent directories.

        //获取该File下的文件及文件夹的列表
        File[] files = file1.listFiles();
        //Returns an array of abstract pathnames denoting the files in the directory
        // denoted by this abstract pathname.


//        File absoluteFile = f1.getAbsoluteFile();
//        String name = f1.getName();
//        long length1 = f1.length();
//        String path = f1.getPath();
//
//        System.out.println(absoluteFile);//D:\CloudMusic
//        System.out.println(name);//CloudMusic
//        System.out.println(length1);//524288
//        System.out.println(path);//D:\CloudMusic

        File f2 = new File("D:\\CloudMusic\\Icona Pop - We Got The World.mp3");
//        System.out.println(f2.getAbsoluteFile());//D:\CloudMusic\Icona Pop - We Got The World.mp3
//        System.out.println(f2.getName());//Icona Pop - We Got The World.mp3
//        System.out.println(f2.length());//7485648
//        System.out.println(f2.getPath());//D:\CloudMusic\Icona Pop - We Got The World.mp3

        File f3 = new File("D:\\IDEA\\IdeaProjects\\FromZeroTOHero");
//        System.out.println(f3.getAbsoluteFile());//D:\IDEA\IdeaProjects\FromZeroTOHero
//        System.out.println(f3.getName());//FromZeroTOHero
//        System.out.println(f3.length());//4096
//        System.out.println(f3.getPath());//D:\IDEA\IdeaProjects\FromZeroTOHero

        File f4 = new File("A.txt");
//        System.out.println(f4.getAbsoluteFile());//D:\IDEA\IdeaProjects\FromZeroTOHero\A.txt
//        System.out.println(f4.getName());//A.txt
//        System.out.println(f4.length());//0
//        System.out.println(f4.getPath());//A.txt


        File f5 = new File("fos.txt");
//        System.out.println(f5.getAbsoluteFile());//D:\IDEA\IdeaProjects\FromZeroTOHero\fos.txt
//        System.out.println(f5.getName());//fos.txt
//        System.out.println(f5.length());//3
//        System.out.println(f5.getPath());//fos.txt

        if (f4.exists()) {//f4不存在
            System.out.println(f4.isDirectory());
            System.out.println(f4.isFile());
        }
        if (f5.exists()) {
            System.out.println(f5.isDirectory());//false
            System.out.println(f5.isFile());//true
            System.out.println(f5.isAbsolute());//false
            System.out.println(f5.isHidden());//false
        }
        System.out.println("--------------------");
        if (f2.exists()) {
            System.out.println(f2.isDirectory());//false
            System.out.println(f2.isFile());//true
            System.out.println(f2.isAbsolute());//true
            System.out.println(f2.isHidden());//false
        }
        System.out.println("--------------------");
        if (f3.exists()) {
            System.out.println(f3.isDirectory());//true
            System.out.println(f3.isFile());//false
            System.out.println(f3.isAbsolute());//true
            System.out.println(f3.isHidden());//false
        }
    }
}
