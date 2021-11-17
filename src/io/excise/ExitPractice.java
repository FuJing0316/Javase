package io.excise;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/15
 * @Description: 模拟退出命令：输入exit时，退出程序
 * @Version: 1.0
 */
public class ExitPractice {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String buf = "";
        try {
            while (!"exit".equals(buf)) {
                buf = bufferedReader.readLine();
                bufferedWriter.write(buf);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
