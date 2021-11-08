package io.streamType;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Author: fujing
 * @Date: 2021/11/8
 * @Description:
 * @Version: 1.0
 */
public class ByteArrayOutPutStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(123);
        try {
            byteArrayOutputStream.write("www.mashibing.com".getBytes());
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
