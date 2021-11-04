package io.streamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 流 表示从一个文件将数据发送到另一个文件，包含一个流向的问题
 * 最终需要选择一个参照物：当前程序（计算机内存）作为参照物
 * 从一个文件中读取数据到程序中，叫输入流
 * 从程序输出数据到另一个文件，叫输出流
 * 步骤：
 * 1、选择合适的io流对象；
 * 2、创建对象；
 * 3、传输数据；
 * 4、关闭流（避免系统资源占用）
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            /**
             * 继续优化demo2:
             *
             */
            inputStream = new FileInputStream("abc.txt");
            byte[] buffer = new byte[1024];
            int length;
            //用添加缓冲区的方式进行读取，每次会将数据添加到缓冲区中，当缓冲区满了之后，一次读取，而不是每个字节读取
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer,0,length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
