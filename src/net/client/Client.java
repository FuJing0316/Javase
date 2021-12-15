package net.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */

/**
 * socket 1： 向服务端发送消息
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象，其实是开启实现io的虚拟接口（此接口不是Java接口，而类似于网线的插槽）
        //创建客户端套接字，需要指定要连接的服务器地址和端口（自身的端口连接上后会系统生成）
        Socket client = new Socket("127.0.0.1", 10086);

        //获取输出流，并向服务器端发送一条消息
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("hello 你好！");

        //关闭流、客户端socket连接
        dataOutputStream.close();
        outputStream.close();
        client.close();

    }
}
