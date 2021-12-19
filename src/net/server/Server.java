package net.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务端的serversocket并绑定到指定端口
        ServerSocket serverSocket = new ServerSocket(10086);
        //获取服务端socket：accept()监听要连接到此套接字的客户端socket，并接受它
        Socket sever = serverSocket.accept();

        //获取输入流
        InputStream inputStream = sever.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println("接收到客户端传来的内容是：" + s);

        //关闭流、socket连接
        dataInputStream.close();
        inputStream.close();
        sever.close();
        serverSocket.close();

    }
}
