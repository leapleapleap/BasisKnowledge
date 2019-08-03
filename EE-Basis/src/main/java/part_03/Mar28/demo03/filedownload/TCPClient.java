package part_03.Mar28.demo03.filedownload;

import java.io.*;
import java.net.Socket;

/*  1.创建socket对象并且指定服务器ip地址以及端口号
    2.使用socket对象获取网络输出流，向服务器要指定文件夹下的文件
    3.使用socket对象获取网络输入流，接收服务器传来的输入流
        3.1.查看本地存储文件的文件夹是否存在，如果不存在话则创建该文件夹
    4.创建本地文件输出字节流，将接收自服务器的流存储到硬盘上
    5.关闭流   */

@SuppressWarnings("all")
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建socket对象并且指定服务器ip地址以及端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //2.使用socket对象获取网络输出流，向服务器要指定文件夹下的文件
        OutputStream os = socket.getOutputStream();
        os.write("D:\\IDEA\\1.jpg\r\n".getBytes());

        //3.使用socket对象获取网络输入流，接收服务器传来的输入流
        InputStream is = socket.getInputStream();
        File file = new File("C:\\Users\\ZY\\Desktop\\java");
        //3.1.查看本地存储文件的文件夹是否存在，如果不存在话则创建该文件夹
        if (!file.exists()){
            file.mkdirs();
        }
        //4.创建本地文件输出字节流，将接收自服务器的流存储到硬盘上
        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");

        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println("下载成功");
        //5.关闭流
        fos.close();
        socket.close();
    }

}
