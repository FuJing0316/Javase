package io.streamDemo;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/2
 * @Description: 将指定的字节写入输出流。 <code>write</code>的一般约定是将一个字节写入输出流。 要写入的字节是参数<code>b</code>的八个低阶位。 <code>b</code>的24个高阶位被忽略。
 * @Version: 1.0
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("bb.txt");

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(100);//将100表示的字节写入文件，write()方法一般约定是将一个字节写入输出流

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
