package part_05.Apr14.owner_test;

import java.io.*;
import java.util.Properties;

@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) throws Exception {
        InputStream is = Demo02.class.getClassLoader().getResourceAsStream("Web_Time\\_0414_practise\\concat_test\\pro.properties");
        Properties pro = new Properties();
        //文件路径中含有中文，所以使用字符转换流接收字节输入流
        pro.load(new InputStreamReader(is));
//        String text = pro.getProperty("text");
//        System.out.println(text);
        File f1 = new File(pro.getProperty("f1_url"));
        File f2 = new File(pro.getProperty("f2_url"));
        File f3 = new File(pro.getProperty("f3_url"));
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);


        /*File f1 = new File("JavaEE_Web/src/Web_Time/_0414_practise/concat_test/音乐串烧练习/音乐文件/王力宏 - 改变自己.mp3");
        File f2 = new File("JavaEE_Web/src/Web_Time/_0414_practise/concat_test/音乐串烧练习/音乐文件/阿冗 - 太多 (cover：陈冠蒲).mp3");
        File f3 = new File("JavaEE_Web/src/Web_Time/_0414_practise/concat_test/音乐串烧练习/音乐文件/concat.mp3");
        */
        concat(f1, f2, f3);
    }

    private static void concat(File f1, File f2, File f3) throws IOException {
        //如果f1或f2时文件夹则提醒用户错误信息
        if (f1.isDirectory() || f2.isDirectory()) {
            System.out.println("您提供的文件是文件夹，请提供正确的mp3格式文件");
            System.exit(0);
            //如果f1或者f2不存在
        } else if (!(f1.exists() && f2.exists())) {
            System.out.println("您提供的文件不存在，请确认后再提交");
            System.exit(0);
        }
        //如果f3不存在，则创建新文件
        if (!f3.exists()) {
            f3.createNewFile();
        }
        //创建两个输入流和一个输出流
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(f1));
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(f2));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f3, true));
        //mp3的比特率为320Kbp/s
        //第一首歌58秒节点处的字节长度
        long start1 = 320 * 1024 * 58 / 8;
        //第一首歌120秒节点处的字节长度
        long end1 = 320 * 1024 * 120 / 8;

        //第二首歌58秒节点处的字节长度
        long start2 = 320 * 1024 * 58 / 8;
        //第二首歌120秒节点处的字节长度
        long end2 = 320 * 1024 * 120 / 8;

        // 定义计数器，统计写入字节数
        long total1 = 0;
        long total2 = 0;

        //总共会写入的字节数
        long allTotalNum = 320 * 124 * 1024 / 8;
        //已写入的字节数
        long allTotal = 0;
        //交替写入的标记
        boolean flag = true;

        //定义一次写入的字节流长度，即交替写入的长度
        byte[] by1 = new byte[4096 * 64];
        int b1 = 0;
        byte[] by2 = new byte[4096 * 64];
        int b2 = 0;
        //永真循环
        while (true) {
            //当写入的总字节长度大于应写入的字节长度
            if (allTotal >= allTotalNum) {
                //跳出循环
                break;
            }
            //根据交替标志决定写入哪首歌曲
            if (flag) {
                if ((b1 = bis1.read(by1)) != -1) {
                    // 统计所写入字节数
                    total1 += b1;
                    // 如果字节数小于58s对应的字节数程序跳过本次循环
                    if (total1 < start1) {
                        flag = !flag;
                        continue;
                    }
                    bos.write(by1);
                    allTotal += b1;
                    //如果写入的字节数大于120秒
                    if (total1 >= end1) {
                        //将缓冲区中的字节写入
                        bos.flush();
                        //停止循环
                        break;
                    }
                    //修改交替标志，写入另一首歌曲
                    flag = !flag;
                }
            } else {
                if ((b2 = bis2.read(by2)) != -1) {
                    // 统计所写入字节数
                    total2 += b2;
                    // 如果字节数小于58s对应的字节数程序跳过本次循环
                    if (total2 < start2) {
                        flag = !flag;
                        continue;
                    }
                    bos.write(by2);
                    allTotal += b2;
                    if (total2 >= end2) {
                        bos.flush();
                        break;
                    }
                    flag = !flag;

                }
            }
        }
        //关闭资源
        if (bos != null) bos.close();
        if (bis1 != null) bis1.close();
        if (bis2 != null) bis2.close();


    }
}
