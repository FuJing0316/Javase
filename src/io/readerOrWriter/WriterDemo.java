package io.readerOrWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: fujing
 * @Date: 2021/11/3
 * @Description:
 * @Version: 1.0
 */

/*
 * 什么时候需要加flush,什么时候不加flush?
 *      最保险的方式，在输出流关闭之前每次都flush一下，然后再关闭
 *      当某一个输出流对象中带有缓冲区的时候，就需要进行flush，不用记流的分类
 *
 * */
public class WriterDemo {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("cc.txt");
            writer.write(88);
            writer.write("我是writer");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
