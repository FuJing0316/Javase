package net.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: fujing
 * @Date: 2021/12/26
 * @Description:
 * @Version: 1.0
 */
public class UDPServer {
    public static void main(String[] args) {
        try {
            //创建socket，接收客户端传输
            DatagramSocket datagramSocket = new DatagramSocket(1001);

            byte[] bytes = new byte[2048];
            //定义DatagramPacket接收数据
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket);

            //打印接收到的信息
            System.out.println("收到的数据信息：" + new String(datagramPacket.getData(), 0, datagramPacket.getLength(), "UTF-8"));

            //关闭socket资源
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
