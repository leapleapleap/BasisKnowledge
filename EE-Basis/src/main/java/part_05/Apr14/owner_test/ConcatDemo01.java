package part_05.Apr14.owner_test;

import java.io.*;

@SuppressWarnings("all")
public class ConcatDemo01 {
    public static void main(String[] args) throws Exception {
        //f1,f2分别为需要剪切的歌曲路径
        File f1 = new File("F:\\CloudMusic\\陈粒 - 小半.mp3");
        File f2 = new File("F:\\CloudMusic\\王力宏 - 改变自己.mp3");
        //f为合并的歌曲
        File f = new File("E:\\CutMusicTest\\MergeMusic.mp3");
        cut(f1,f2,f);
    }
    public static void cut(File f1, File f2, File f) throws Exception {
        // 创建对应的输入流，选择缓冲字节流
        BufferedInputStream bs1 = new BufferedInputStream(new FileInputStream(f1));
        BufferedInputStream bs2 = new BufferedInputStream(new FileInputStream(f2));
        // 创建对应的输出流，选择缓冲字节流，注意内容可覆盖
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f, true));
        // 计算开始字节数以及结束字节数
        long start1 = 320 * 58 * 1024 / 8;
        long end1 = 320 * 120 * 1024 / 8;

        long start2 = 320 * 58 * 1024 / 8;
        long end2 = 320 * 120 * 1024 /8;

        // 定义计数器，统计写入字节数
        long total1 = 0;
        long total2 = 0;

        // 开始写入第一个音乐文件
        byte[] by1 = new byte[512];
        int b1 = 0;
        while ((b1 = bs1.read(by1)) != -1) {
            // 统计所写入字节数
            total1 += b1;
            // 如果字节数小于58s对应的字节数程序跳过本次循环
            if(total1 < start1) {
                continue;
            }
            bos.write(by1);
            if(total1 >= end1) {
                bos.flush();
                break;
            }
        }
        System.out.println("第一首歌写入完成");

        byte[] by2 = new byte[512];
        int b2 = 0;
        while ((b2 = bs2.read(by2)) != -1) {
            total2 += b2;
            if(total2 < start2) {
                continue;
            }
            bos.write(by2);
            if(total2 >= end2) {
                bos.flush();
                break;
            }
        }

        if(bs1 != null) bs1.close();
        if(bs2 != null) bs2.close();
        if(bos != null) bos.close();
    }
}
