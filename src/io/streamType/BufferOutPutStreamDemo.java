package io.streamType;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/7
 * @Description:
 * @Version: 1.0
 */
public class BufferOutPutStreamDemo {
    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream = null;
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("bb.txt");
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            bufferedOutputStream.write("gggggg哈哈".getBytes());

            bufferedOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
