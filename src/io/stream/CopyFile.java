package io.stream;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/1
 * @Description:
 * @Version: 1.0
 */
public class CopyFile {

    //将abc.txt中的内容写入到 aa.txt中
    public static void main(String[] args) {
        //数据源
        File src = new File("abc.txt");
        //目的地
        File dest = new File("aa.txt");

        //输入流
        InputStream inputStream = null;
        //输出流
        OutputStream outputStream = null;

        //使用带缓冲的方式输入 输出
        byte[] buffer = new byte[1024];
        //每次读取的数据长度
        int length;

        //完成数据传输
        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(dest);
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
