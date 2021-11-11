package io.readerOrWriter;


import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/3
 * @Description:
 * @Version: 1.0
 */
public class CopyPicture {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("1.jpg");
            outputStream = new FileOutputStream("2.jpg");
            int length = 0;
            byte[] buffer = new byte[1024];
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.flush();
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
