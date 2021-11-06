package io.streamType;

import sun.security.util.Length;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/6
 * @Description: DataInputStream 、DataOutputStream  内部有作序列化，写出顺序和读入顺序 须一致，才能保证读写正常，否则可能乱码
 * @Version: 1.0
 */
public class DataStreamDemo {
    public static void main(String[] args) {

        DataInputStream dataInputStream = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        byte[] buffer = new byte[2048];

        try {
            //向文件中写入数据
            outputStream = new FileOutputStream("dd.txt");
            dataOutputStream = new DataOutputStream(outputStream);
//            dataOutputStream.write(1);
            dataOutputStream.writeBoolean(true);
//            dataOutputStream.writeBytes("abc中国");
//            dataOutputStream.writeChars("eee");
            dataOutputStream.writeLong((long) 1.15);
            dataOutputStream.writeUTF("上海hello");//UTF-8格式写入文件

            //从文件中读取数据
            inputStream = new FileInputStream("dd.txt");
            dataInputStream = new DataInputStream(inputStream);
//            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readBoolean());
//            System.out.println(dataInputStream.readByte());
//            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                dataOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
