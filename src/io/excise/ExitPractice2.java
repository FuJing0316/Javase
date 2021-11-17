package io.excise;

import java.io.*;

/**
 * @Author: fujing
 * @Date: 2021/11/15
 * @Description: 模拟退出命令：输入exit时，退出程序
 * <p>
 * 彩蛋：
 * 在流中，可以将流对象的创建放在try块中，这样就不用显示的去关闭流，使得代码更简洁
 *
 * @Version: 1.0
 */
public class ExitPractice2 {
    public static void main(String[] args) {

        String buf = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));) {
            while (!"exit".equals(buf)) {
                buf = bufferedReader.readLine();
                bufferedWriter.write(buf);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
