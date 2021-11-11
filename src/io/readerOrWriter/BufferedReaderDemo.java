package io.readerOrWriter;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/10
 * @Description: 1、从字符输入流中读取文本；   2、可以提供按字符、按行、读入暂存数组的高效读取。  3、这是一个高频使用api
 * @Version: 1.0
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        //第一种读法：read() 从输入流中，将数据读到char[]数组中暂存
        demo1();

        System.out.println("====================");
        //第二种，readLine()  按行读取输入流中的数据
        demo2();

    }

    private static void demo2() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("ee.txt"));
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                s = s + "\n" + bufferedReader.readLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     */
    private static void demo1() {
        BufferedReader bufferedReader = null;
        Reader reader = null;
        try {
            reader = new FileReader("ee.txt");
            bufferedReader = new BufferedReader(reader);
            char[] chars = new char[1024];
            int read = 0;
            while ((read = bufferedReader.read(chars)) != -1) { //从字符输入流中，把字符数据写入chars数组
                System.out.println(new String(chars, 0, read));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
