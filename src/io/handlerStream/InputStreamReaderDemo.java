package io.handlerStream;


import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/4
 * @Description: InputStream 对应的处理流 InputStreamReader，效率比InputStream高，可指定字符编码来读取数据
 * @Version: 1.0
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");

        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;

        char[] buffer = new char[1024];
        int length = 0;
        try {
            long start = System.currentTimeMillis();

            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            while ((length = inputStreamReader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length));
            }

            long end = System.currentTimeMillis();
            System.out.println("数据读取时间：" + (end - start));

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

            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
