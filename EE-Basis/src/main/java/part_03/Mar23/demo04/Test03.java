package part_03.Mar23.demo04;

import java.io.File;

@SuppressWarnings("all")
public class Test03 {
    public static void main(String[] args) {
        //创建文件对象
        File f = new File("D:\\Java\\03.22 线程池&Lambda表达式");
        //调用方法
        getAllDir(f, new Test03_Judge() {
            @Override
            public boolean method(File f) {
                if (f.isDirectory()){
                    return true;
                }else {
                    return f.toString().toLowerCase().endsWith(".java");
                }
            }
        });
    }

    public static void getAllDir(File f, Test03_Judge j) {
        //输出文件对象根目录
        //System.out.println(f);

        //调用File类的listFiles方法获得文件数组
        File[] files = f.listFiles();

        //循环遍历文件数组
        for (File file : files) {
            //当该文件是文件夹时
            if (file.isDirectory()) {
                //递归调用getAllDir方法
                getAllDir(file, j);
            } else {
                //f.getName();
                //f.getPath();

                /*  if (file.toString().toLowerCase().endsWith(".java")) {
                        //或者输出文件名
                        System.out.println(file);
                    }   */

                if (j.method(file)) {
                    System.out.println(file);
                }
            }
        }
    }

}
