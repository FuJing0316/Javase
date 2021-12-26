package net.client;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: fujing
 * @Date: 2021/12/26
 * @Description:
 * @Version: 1.0
 */
public class UDPClient {
    public static void main(String[] args) {
        try {
            //创建UDP通信的socket,并将其绑定到本地主机的指定端口
            DatagramSocket datagramSocket = new DatagramSocket(8888);

            //控制台输入要传输的数据
            System.out.println("请输入：");
            Scanner scanner = new Scanner(System.in);
            String bufStr = scanner.nextLine();

            //准备要传输的数据包：四个参数分别是 传输数据字节数组、长度、传输目的地的主机地址、端口
            DatagramPacket datagramPacket = new DatagramPacket(bufStr.getBytes(), bufStr.length(), InetAddress.getByName("localhost"), 1001);
            //使用socket发送数据包
            datagramSocket.send(datagramPacket);

            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
