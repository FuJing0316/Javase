package io.readerOrWriter;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @Author: fujing
 * @Date: 2021/11/10
 * @Description: CharArrayReader  该类实现了一个字符缓冲区，可以用作字符输入流。
 * @Version: 1.0
 */
public class charArrayReaderDemo {
    public static void main(String[] args) {
        char[] chars = "你好吗中国".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        int read = 0;
        try {
            while ((read = charArrayReader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }
    }
}
