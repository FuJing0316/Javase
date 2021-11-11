package io.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author: fujing
 * @Date: 2021/11/2
 * @Description: 字符流可以直接读取中文汉字，而字节流在处理中文汉字的时候，会出现中文乱码
 * @Version: 1.0
 */
public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            //读取文件中的一个字符
            reader = new FileReader("abc.txt");
            int read = reader.read();
            System.out.println((char) read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
