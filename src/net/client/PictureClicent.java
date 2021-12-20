package net.client;

import java.io.*;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/18
 * @Description:
 * @Version: 1.0
 */

/**
 *功能说明：
 * 客户端上传图片到服务端socket，服务端将图片输出到本地，并给客户端返回响应：图片上传成功。
 *
 *
 */
public class PictureClicent {
    public static void main(String[] args) throws IOException {
        //创建流套接字并将其连接到指定的IP和端口
        Socket client = new Socket("localhost", 5050);

        //建立图片输入流对象，将本地图片读入程序
        FileInputStream fileInputStream = new FileInputStream("qige.jpg");
        int read = 0;

        //获取客户端向服务端进行io的输出流
        OutputStream outputStream = client.getOutputStream();
        while ((read = fileInputStream.read()) != -1) {
            outputStream.write(read);
        }
        //结束客户端输出
        client.shutdownOutput();

        //接收服务端的响应
        InputStream inputStream = client.getInputStream();
        byte[] bytes = new byte[1024];
        int length;
        length = inputStream.read(bytes);
        System.out.println("server resp：" + new String(bytes, 0, length));


        //关闭操作
        outputStream.close();
        fileInputStream.close();
        client.close();
    }
}
