package net.client;

/**
 * @Author: fujing
 * @Date: 2021/12/20
 * @Description:
 * @Version: 1.0
 */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 利用socket完成一个登录的功能：
 * <p>
 * 1、客户端：传递一个user对象（假设会输入user的用户名、密码）
 * 2、服务端：校验用户名、密码是否正确，并将校验结果信息返回给客户端（如果密码输错，提示密码错误，直到输正确，提示登录成功）
 * <p>
 * 注意： 知识点：
 *      ---什么是序列化？
 *      https://www.cnblogs.com/yangchunze/p/6728086.html
 */

public class LoginClient {
    public static void main(String[] args) throws IOException {
        //创建客户端socket并连接到本机地址的9999端口socket
        Socket clinet = new Socket("127.0.0.1",10087);

        //获取socket的输出流，准备输出密码
        OutputStream outputStream = clinet.getOutputStream();
        //网络传输一个object对象，得构造一个ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        //准备要传输的user
        LoginUser user = getLoginUser();
        //传输user信息
        objectOutputStream.writeObject(user);
        //传输完毕，截断客户端输入流
        clinet.shutdownOutput();


        //接收服务端的返回信息，并输出到控制台
        InputStream inputStream = clinet.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);


        //关闭操作
        dataInputStream.close();
        inputStream.close();
        objectOutputStream.close();
        outputStream.close();
        clinet.close();
    }

    private static LoginUser getLoginUser() {
        //接收用户的输入，将其封装为要传输的user对象
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.nextLine();
        System.out.print("请输入密码：");
        String psw = scanner.nextLine();

        return new LoginUser(name,psw);
    }

}
