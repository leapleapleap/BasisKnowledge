package part_03.Mar25.demo09;

import java.io.*;

@SuppressWarnings("all")
public class CopyDirectory {
    public static void main(String[] args) {
        //原文件夹目录(测试的时候注意替换目录)
        File srcDir = new File("D:\\IDEA\\IdeaProjects\\FromZeroTOHero\\JavaEE_basis" +
                "\\src\\_0325_stu_stream_bytes_char\\homework03\\a");
        //目标文件夹目录(测试的时候注意替换目录)
        File destDir = new File("D:\\IDEA\\IdeaProjects\\FromZeroTOHero\\JavaEE_basis" +
                "\\src\\_0325_stu_stream_bytes_char\\homework03\\b");
        //调用方法，完成复制
        System.out.println("正在复制,请稍等...");
        copyDir(srcDir, destDir);
        System.out.println("复制完成！！！");
    }
    /**
     * 通过递归，完成文件夹的复制
     *
     * @param srcDir  原文件夹
     * @param destDir 目标文件夹
     */
    private static void copyDir(File srcDir, File destDir) {
        //1.创建目标文件夹
        destDir.mkdir();
        //2.遍历原文件夹，得到原文件夹中所有的内容
        File[] files = srcDir.listFiles();
        for (File file : files) {
            //3.判断是不是文件夹，如果是文件夹，则递归调用，不是文件夹，则完成文件复制
            if (file.isDirectory()) {
                //3.1 得到原文件夹的路径
                String srcPath = file.getAbsolutePath();
                //3.2 完成目录拼接，得到目标文件夹的路径
                String destPath = srcPath.replace(srcDir.getAbsolutePath(), destDir.getAbsolutePath());
                //3.3 递归调用复制文件夹的方法
                copyDir(new File(srcPath), new File(destPath));
            } else {
                //3.4 得到原文件的路径
                String srcPath = file.getAbsolutePath();
                //3.2 完成目录拼接，得到目标文件的路径
                String destPath = srcPath.replace(srcDir.getAbsolutePath(), destDir.getAbsolutePath());
                //3.3 调用复制文件的方法，完成文件复制
                copy(new File(srcPath), new File(destPath));
            }
        }
    }
    /**
     * 通过IO流，完成文件复制
     *
     * @param srcFile
     * @param destFile
     */
    public static void copy(File srcFile, File destFile) {
        InputStream in = null;
        OutputStream out = null;
        try {
            //1.创建输入流对象
            in = new FileInputStream(srcFile);
            //2.创建输出流对象
            out = new FileOutputStream(destFile);
            //3.完成文件复制
            int len;
            byte[] bys = new byte[1024];
            while ((len = in.read(bys)) != -1) {
                out.write(bys, 0, len);
            }
        } catch (Exception e) {
            //抛出运行时异常，提示用户
            throw new RuntimeException("文件复制失败，源文件：" + srcFile + ",目标文件：" + destFile);
        } finally {
            //4.释放资源
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
