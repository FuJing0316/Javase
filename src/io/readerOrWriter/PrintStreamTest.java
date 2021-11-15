package io.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author: fujing
 * @Date: 2021/11/11
 * @Description: PrintStream是 FilterOutputStream 的子类，为另外一个输出流增强了功能，是一个输出流
 * @Version: 1.0
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try {
//            PrintStream printStream = new PrintStream(new FileOutputStream("gg.txt"));//输出到文件
            PrintStream printStream = new PrintStream(System.out);//标准输出：输出到控制台
            printStream.append("hello 123 中国啊");//将指定字符追加到输出流，此处写入了文件
            printStream.write(99);//将指定的字节写入流
            printStream.write("中国人".getBytes());//将指定的字节写入流

            //标准输出流
            System.out.println("hello zh");//等价于 PrintStream.println()
            //标准错误输出流
            System.err.println("err test");
            //标准输入流
//            System.in

            //格式化输出：PrintStream.printf(String format, Object... args) %s：字符串  %d:整数  %f:浮点数
            //使用指定的格式字符串和参数将格式化的字符串写入此输出流的便利方法。
            System.out.printf("%s------%d------%.2f","你好",88,15.555555f);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
