package part_03.Mar28.demo03.filedownload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*  1.创建服务器端ServerSocket对象并且指定端口号
    2.调用SeverSocket类的accept方法获得客户机端的socket对象
    3.使用socket对象获得输入流，获取用户想要下载文件的地址信息
    4.创建文件对象接收路径字符串
    5.创建本地文件字节输入流，将服务器端的文件读入到流
    6.使用socket对象获取网络输出流
    7.一边读取硬盘中的文件一边写出给客户机端
    8.最后结束流并且发送结束标记到客户机端
    9.关闭各种流及对象  */
@SuppressWarnings("all")
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端ServerSocket对象并且指定端口号
        ServerSocket server = new ServerSocket(8888);
        //2.调用SeverSocket类的accept方法获得客户机端的socket对象
        Socket socket = server.accept();
        //3.使用socket对象获得输入流，获取用户想要下载文件的地址信息
        InputStream is = socket.getInputStream();
        //4.创建文件对象接收路径字符串
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        String file = bf.readLine();
        //5.创建本地文件字节输入流，将服务器端的文件读入到流
        FileInputStream fis = new FileInputStream(file);
        //6.使用socket对象获取网络输出流
        OutputStream os = socket.getOutputStream();
        //7.一边读取硬盘中的文件一边写出给客户机端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //8.最后结束流并且发送结束标记到客户机端
        socket.shutdownOutput();
        //9.关闭各种流及对象
        fis.close();
        bf.close();
        socket.close();
        server.close();
    }
}
