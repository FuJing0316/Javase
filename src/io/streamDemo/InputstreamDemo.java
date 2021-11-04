package io.streamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: fujing
 * @Date: 2021/11/2
 * @Description:
 * @Version: 1.0
 */
public class InputstreamDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
            int read = inputStream.read();
            System.out.println((char) read);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
