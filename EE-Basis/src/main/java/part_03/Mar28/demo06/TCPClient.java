package part_03.Mar28.demo06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*  1.创建本地文件输入流，参数传递本地文件地址
    2.创建客户端socket对象，绑定服务器IP地址和端口号
    3.使用socket对象获取网络输出流
    4.读取本地文件的同时写入网络输出流
    5.使用socket对象获取网络输入流
    6.读取输入流，打印服务端传来的信息
    7.关闭流及socket对象  */
@SuppressWarnings("all")
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建本地文件输入流，参数传递本地文件地址
        FileInputStream fis = new FileInputStream("D:\\IDEA\\1.jpg");
        //2.创建客户端socket对象，绑定服务器IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 10086);
        //3.使用socket对象获取网络输出流
        OutputStream os = socket.getOutputStream();
        //4.读取本地文件的同时写入网络输出流
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //4.1调用Socket类的shutdownOutput方法：任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列
        socket.shutdownOutput();
        //5.使用socket对象获取网络输入流
        InputStream is = socket.getInputStream();
        //6.读取输入流，打印服务端传来的信息
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //7.关闭流及socket对象
        os.close();
        fis.close();
    }
}
