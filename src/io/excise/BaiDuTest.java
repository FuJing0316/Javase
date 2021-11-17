package io.excise;

import java.io.*;
import java.net.URL;

/**
 * @Author: fujing
 * @Date: 2021/11/16
 * @Description: 使用读取百度首页返回的数据
 * @Version: 1.0
 */
public class BaiDuTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://www.baidu.com/").openStream(), "UTF-8"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html")));
            String s = "";
            while ((s=bufferedReader.readLine())!= null) {
                s = bufferedReader.readLine();
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
