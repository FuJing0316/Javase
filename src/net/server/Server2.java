package net.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        //服务端需要使用serverSocket需要开发自己本地的端口
        ServerSocket serverSocket = new ServerSocket(10086);
        //要接收客户端传过来的数据，需要定义一个socket对象
        Socket sever = serverSocket.accept();

        //获取输入流，接收客户端发来的内容
        InputStream inputStream = sever.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println("接收到客户端传来的内容是：" + s);

        //获取输出流，响应客户端消息
        OutputStream outputStream = sever.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write("hello client，你好啊啊".getBytes());


        //关闭流、socket连接
        bufferedOutputStream.close();
        outputStream.close();
        dataInputStream.close();
        inputStream.close();
        sever.close();
        serverSocket.close();

    }
}
