package io.streamType;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/7
 * @Description:
 * @Version: 1.0
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("bb.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);

            int length = 0;
            while ((length = bufferedInputStream.read()) != -1) {
                System.out.print((char) length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
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
