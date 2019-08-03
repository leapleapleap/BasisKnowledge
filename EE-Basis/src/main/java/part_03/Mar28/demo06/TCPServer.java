package part_03.Mar28.demo06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*  1.创建ServerSocket对象并且传入指定端口号
    2.使用ServerSocket对象的accept方法获取客户端的socket对象
    3.使用socket对象获取网络输入流
    4.判断本地是否有相应的文件夹，若无则创建新文件夹
    5.创建本地文件输出流，并指定流出的地址
    6.在网络输入流读取文件的同时使用本地输出流将读取到的文件存储到指定的位置
    7.使用socket对象获取网络输出流
    8.给客户机发送“上传成功”的信息
    9.关闭相应的对象和本地流   */
@SuppressWarnings("all")
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象并且传入指定端口号
        ServerSocket serverSocket = new ServerSocket(10086);
        //1.1希望客户端一致处于监听状态，不要在接收一次数据后就停止服务
        while (true){
            //2.使用ServerSocket对象的accept方法获取客户端的socket对象
            Socket socket = serverSocket.accept();
            //2.1使用多线程方法提高效率
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //Runnable类的run方法没有抛出异常，所以重写的run方法若有异常则只能try...catch处理
                    try{
                        //3.使用socket对象获取网络输入流
                        InputStream is = socket.getInputStream();
                        //4.判断本地是否有相应的文件夹，若无则创建新文件夹
                        //4.1避免之前照片的覆盖，需要将文件名重构
                        String name = "itcast"+System.currentTimeMillis()+new Random().nextInt(99999) +".jpg";
                        File file = new File("C:\\Users\\ZY\\Desktop\\Java");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //5.创建本地文件输出流，并指定流出的地址
                        FileOutputStream fos = new FileOutputStream(file + "\\"+name);
                        //6.在网络输入流读取文件的同时使用本地输出流将读取到的文件存储到指定的位置
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        //7.使用socket对象获取网络输出流
                        OutputStream os = socket.getOutputStream();
                        //8.给客户机发送“上传成功”的信息
                        os.write("上传成功".getBytes());
                        //9.关闭相应的对象和本地流
                        fos.close();
                        socket.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }
}
