package net.server;

/**
 * @Author: fujing
 * @Date: 2021/12/25
 * @Description:
 * @Version: 1.0
 */
public class LoginServer2 {
    public static void main(String[] args) {

        new Thread(new LoginThread()).start();
    }
}
