package io.readerOrWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: fujing
 * @Date: 2021/11/10
 * @Description:
 * @Version: 1.0
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("ff.txt"));
            bufferedWriter.write("你好，bufferedWriter");
            bufferedWriter.newLine();
            bufferedWriter.append("wo laile aaaa");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
