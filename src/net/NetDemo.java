package net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */

/**
 * InetAddress ：封装了ip对象
 *
 * InetSocketAddress ：封装了ip，端口号
 *
 */
public class NetDemo {
    public static void main(String[] args) {
        try {
            //计算机名/IP
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);
            System.out.println("-------------------------");
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 4444);
            System.out.println(inetSocketAddress.getAddress());
            System.out.println(inetSocketAddress.getHostName());
            System.out.println(inetSocketAddress.getPort());
            System.out.println(inetSocketAddress.getHostString());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
