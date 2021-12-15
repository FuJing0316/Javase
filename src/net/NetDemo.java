package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */
public class NetDemo {
    public static void main(String[] args) {
        try {
            //计算机名/IP
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
