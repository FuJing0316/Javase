package io.handlerStream;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/4
 * @Description: 处理流OutputStreamWriter   对OutputStream进行了再包装，效率比OutputStream高
 * @Version: 1.0
 */
public class OutPutStreamWriterDemo {
    public static void main(String[] args) {
        File file = new File("dd.txt");
        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;

        try {
            long start = System.currentTimeMillis();

            outputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(outputStream, "iso8859-1");
            outputStreamWriter.write(99);
            outputStreamWriter.write("中国人中国新");

            long end = System.currentTimeMillis();

            System.out.println("本次流处理时间：" + (end - start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流的时候，一般按照创建的顺序，逆序关闭
            try {
                outputStreamWriter.flush();
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
