package io.readerOrWriter;

import java.io.CharArrayWriter;

/**
 * @Author: fujing
 * @Date: 2021/11/11
 * @Description: CharArrayWriter 实现了一个可以用作writer 的缓冲区，当数据写入流时，缓冲区会自动增长。
 * @Version: 1.0
 */
public class charArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);//将一个字符写入缓冲区
        charArrayWriter.write("五星红旗迎风飘扬，中国你好",0,4);//将一部分数据写入缓冲区
        charArrayWriter.write(98);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
