package net.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/19
 * @Description:
 * @Version: 1.0
 */
public class PictureServer {
    public static void main(String[] args) throws IOException {
        //创建绑定到指定端口的服务端套接字
        ServerSocket serverSocket = new ServerSocket(5050);
        //获取到服务端socket：accept监听连接到此服务端套接字的客户端，并接受它
        Socket server = serverSocket.accept();

        //创建图片的输出流对象：将动客户端收到的图片输出到本地文件
        FileOutputStream fileOutputStream = new FileOutputStream("bk_qige.jpg");

        //获取serversocket的输入流对象：以便获取客户端传来的图片
        InputStream inputStream = server.getInputStream();
        int temp = 0;
        while ((temp = inputStream.read()) != -1) {
            fileOutputStream.write(temp);  //图片写出到本地
        }


        //客户端图片上传成功，服务器端要给客户端一个回应
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
        dataOutputStream.writeUTF("你好，你的图片已经上传成功");


        //关闭操作
        dataOutputStream.close();
        fileOutputStream.close();
        fileOutputStream.close();
        server.close();
        serverSocket.close();

    }
}
