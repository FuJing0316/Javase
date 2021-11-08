package io.streamType;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/7
 * @Description:
 * @Version: 1.0
 */
public class ObjecInputStreamDemo {
    public static void main(String[] args) {
        //从文件中读取ObjectOutPutStreamDemo 写入的数据
        ObjectInputStream objectInputStream = null;
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("aa.txt");
            objectInputStream = new ObjectInputStream(inputStream);

            //注意： ObjectInputStream 在读取数据时，数据类型和顺序必须和 ObjectOutputStream 写的顺序一致
            System.out.println(objectInputStream.readUTF());
            System.out.println(objectInputStream.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
