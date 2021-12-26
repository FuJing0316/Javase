package net.server;

import net.client.LoginUser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: fujing
 * @Date: 2021/12/20
 * @Description:
 * @Version: 1.0
 */
public class LoginServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个serversocket，并绑定到指定端口
        ServerSocket serverSocket = new ServerSocket(10087);

        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        OutputStream outputStream = null;
        DataOutputStream  dataOutputStream = null;

        //一直等着客户端输入正确的用户名，密码，提示登录成功
        while (true) {
            //监听连接到此serversocket的连接，并接受他们（要连接进来的客户端）
            Socket server = serverSocket.accept();//阻塞方法

            //获取服务端socket的输入流，准备接受客户端传来的数据
            inputStream = server.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);
            //接受客户端数据
            LoginUser loginUser = (LoginUser) objectInputStream.readObject();
            //截断服务端的输入，准备开始逻辑判断
            server.shutdownInput();


            //校验客户端数据
            String resp = "登录成功，欢迎您";
            if (!"zhangsan".equals(loginUser.getName())) {
                resp = "用户名输入错误";
            }
            if (!"123".equals(loginUser.getPassWord())) {
                resp = "密码输入错误";
            }

            //获取server的输出流，准备给客户端返回响应
            outputStream = server.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            //给客户端返回响应
            dataOutputStream.writeUTF(resp);
            //截断服务端的输出流
            server.shutdownOutput();


            //关闭操作
            dataOutputStream.close();
            outputStream.close();
            objectInputStream.close();
            inputStream.close();
            server.close();
        }

//        serverSocket.close();
    }
}
