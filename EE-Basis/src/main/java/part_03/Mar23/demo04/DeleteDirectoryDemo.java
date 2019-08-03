package part_03.Mar23.demo04;

import java.io.File;

public class DeleteDirectoryDemo {
    public static void main(String[] args) {
        //定义要被删除的文件夹对应的File变量
        File directory = new File("E:\\a");
        //调用方法，完成删除
        deleteDirectory(directory);
    }

    /**
     * 定义一个方法，完成删除文件夹的功能；
     * @param directory 要被删除的文件夹对象
     */
    private static void deleteDirectory(File directory) {
        //1.先删除文件夹里面的内容
        //1.1得到文件夹中所有的内容，File[]
        File[] files = directory.listFiles();
        //1.2遍历File[]，得到每一个File对象
        for (File file : files) {
            if (file.isFile()){
                //如果是文件，则直接调用delete方法，删除
                file.delete();
            }else{
                //如果是文件夹，递归调用当前删除文件夹的方法，完成文件夹的删除
                deleteDirectory(file);
            }

        }

        //2.再删除当前的空文件夹
        directory.delete();
    }
}
