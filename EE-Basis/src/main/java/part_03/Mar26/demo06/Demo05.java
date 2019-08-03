package part_03.Mar26.demo06;

import java.io.*;

public class Demo05 {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        File file = new File("JavaEE_basis\\1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        if (file.exists()) {
            bw = null;
        }

        String len = br.readLine();
//        int i = Integer.valueOf(len).intValue();
        int i = Integer.parseInt(len);
        if (i <= 3) {
            System.out.println("欢迎使用本软件,第" + i++ + "次使用免费~");
        } else {
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        }
        if (bw == null) {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(String.valueOf(i));
            bw.close();
        }
        br.close();
    }
}
