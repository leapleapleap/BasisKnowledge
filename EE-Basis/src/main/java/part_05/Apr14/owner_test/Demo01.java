package part_05.Apr14.owner_test;

import java.io.*;

@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /*InputStream is = Test.class.getClassLoader().getResourceAsStream("D:\\develop\\programs\\JavaEE_Web\\src\\Web_Time\\_0414_practise\\concat_test\\pro.properties");
        Properties pro = new Properties();
        pro.load(is);*/

        File f1 = new File("D:/develop/programs/JavaEE_Web/src/Web_Time/_0414_practise/concat_test/音乐串烧练习/音乐文件/王力宏 - 改变自己.mp3");
        File f2 = new File("D:/develop/programs/JavaEE_Web/src/Web_Time/_0414_practise/concat_test/音乐串烧练习/音乐文件/阿冗 - 太多 (cover：陈冠蒲).mp3");
        File f3 = new File("D:/develop/programs/JavaEE_Web/src/Web_Time/_0414_practise/concat_test/音乐串烧练习/音乐文件/concat.mp3");

        concat(f1, f2, f3);
    }

    private static void concat(File f1, File f2, File f3) throws IOException {
        if (f1.isDirectory() || f2.isDirectory()) {
            System.out.println("您提供的文件是文件夹，请提供正确的mp3格式文件");
            System.exit(0);
        } else if (!(f1.exists() && f2.exists())) {
            System.out.println("您提供的文件不存在，请确认后再提交");
            System.exit(0);
        }

        if (!f3.exists()) {
            f3.createNewFile();
        }
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(f1));
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(f2));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f3, true));

        long start1 = 320 * 1024 * 58 / 8;
        long end1 = 320 * 1024 * 120 / 8;

        long start2 = 320 * 1024 * 58 / 8;
        long end2 = 320 * 1024 * 120 / 8;

        long total1 =0;
        long total2 =0;
        byte[] byte1 = new byte[512];
        int b1=0;

        while((b1=bis1.read(byte1))!=-1){
            total1+=b1;
            if(total1<start1){
                continue;
            }
            bos.write(byte1);
            if(total1>=end1){
                bos.flush();
                break;
            }
        }
        System.out.println("第一首歌写入完成");
        byte[] byte2 = new byte[512];
        int b2=0;

        while((b2=bis2.read(byte2))!=-1){
            total2+=b2;
            if(total2<start2){
                continue;
            }
            bos.write(byte2);
            if(total2>=end2){
                bos.flush();
                break;
            }
        }
        System.out.println("第二首歌写入完成");

        if(bos!=null)bos.close();
        if(bis1!=null)bis1.close();
        if(bis2!=null)bis2.close();



    }
}