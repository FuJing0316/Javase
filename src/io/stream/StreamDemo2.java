package io.stream;

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
public class StreamDemo2 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            /**
             * 优化demo1:能读出文件全部内容
             * 存在问题：存在问题，每次只能读取一个字节，效率比较低，需要循环N多次
             */
            inputStream = new FileInputStream("abc.txt");
            int read ;
            while ((read = inputStream.read()) != -1) {
                System.out.println((char) read);
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
