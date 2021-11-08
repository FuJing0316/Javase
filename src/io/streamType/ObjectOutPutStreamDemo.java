package io.streamType;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/7
 * @Description: ObjectOutPutStreamDemo
 * @Version: 1.0
 */
public class ObjectOutPutStreamDemo {
    public static void main(String[] args) {
        //使用ObjectOutputStream 流将数据写入文件
        ObjectOutputStream objectOutputStream = null;
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("aa.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeUTF("aha中国啊");//将一个字符串以modified UTF-8格式写入流
            objectOutputStream.writeObject(new Student("xiaobai", 11,"123456"));//将一个对象写入流
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
