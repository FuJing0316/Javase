package io.streamType;

import java.io.ByteArrayInputStream;

/**
 * @Author: fujing
 * @Date: 2021/11/7
 * @Description: A ByteArrayInputStream包含一个内部缓冲区，其中包含可以从流中读取的字节。 read方法可以读取流中下一个字节。
 * @Version: 1.0
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String src = "haha这是我的bytearrayinputstreamdemo a ";
        byte[] buffer = src.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while ((read = byteArrayInputStream.read()) != -1) {
            byteArrayInputStream.skip(4);
            System.out.print((char)read);
        }

    }
}
