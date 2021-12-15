package net.client;

import java.io.*;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */

/**
 * socket 2：
 * 客户端、服务端双向通信
 *
 */
public class Client2 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象，其实是开启实现io的虚拟接口（此接口不是Java接口，而类似于网线的插槽）
        //创建客户端套接字，需要指定要连接的服务器地址和端口（自身的端口连接上后会系统生成）
        Socket client = new Socket("localhost", 10086);

        //获取输出流，向服务器端发送消息
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("hello server,你好！");


        //获取输入流，读取客户端响应的消息
        InputStream inputStream = client.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = new byte[1024];
        int length = bufferedInputStream.read(bytes);
        System.out.println("服务端响应的消息是："+ new String(bytes,0,length));


        //关闭流、客户端socket连接
        bufferedInputStream.close();
        inputStream.close();
        dataOutputStream.close();
        outputStream.close();
        client.close();
    }
}
