package io;

/**
 * @Author: fujing
 * @Date: 2021/11/20
 * @Description: RandomAaccessFile 支持读取和写入时 随机访问文件。  例如，HDFS分布式文件存储系统中，数据存放在文件中，大文件又会被拆分成很多数据块，进行处理（分而治之）。
 * @Version: 1.0
 */

import sun.security.util.Length;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 分块读取一个大文件
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        File file = new File("bb.txt");
        //整个文件大小（单位：字节）
        long length = file.length();
        //规定每块的大小
        int blockSize = 1024;
        //文件被分割成多少块 (此处注意，切分最后一块的处理，向上取整)
        int size = (int) Math.ceil(length * 1.0 / blockSize);   //Math.ceil(double a)   返回大于或等于参数的最小double值
        System.out.println("文件被拆分成了%d个块:" + size);

        int perBeginPos = 0;
        //每次实际读取的文件大小（拆分后，最后一块和前面块的大小基本都是不一样的）
        int actualPerSize = (int) (blockSize > length ? length : blockSize);

        for (int i = 0; i < size; i++) {
            //表示每次读取一块时的开始的位置（起始偏移量）
            perBeginPos = i * blockSize;
            if (i == size - 1) {
                actualPerSize = (int) length;
            } else {
                actualPerSize = blockSize;
                length -= actualPerSize; //注意此处：每次读完，length要减掉已读完的
            }
            System.out.println("第%d次读："+i + "---》起始位置是：" + perBeginPos + "---->读取的大小是：" + actualPerSize);

            //按块读取
            readOneBlock(i, perBeginPos, actualPerSize);

        }
    }

    /**
     * 从指定位置，读取指定长度的文件内容
     *
     * @param i             第几次读
     * @param perBeginPos   开始偏移量
     * @param actualPerSize 本次读取的实际总大小
     */
    private static void readOneBlock(int i, int perBeginPos, int actualPerSize) {
        RandomAccessFile randomAccessFile = null;

        try {
            randomAccessFile = new RandomAccessFile(new File("bb.txt"), "r");
            //设置文件指针读取文件的偏移量（从文件的开头测量）
            randomAccessFile.seek(perBeginPos);

            //实际读取的长度
            int len = 0;
            //每次先将内容读到缓冲数组
            byte[] buffer = new byte[1024];

            //没读到指定大小（actualPerSize）的内容，会一直循环读
            while ((len = randomAccessFile.read(buffer)) != -1) {
                if (actualPerSize > len) {
                    //本次 没读到指定大小（actualPerSize） 的内容
                    System.out.println(new String(buffer, 0, len));
                    actualPerSize -= len;
                } else {
                    //读完了指定大小（actualPerSize）的内容
                    System.out.println(new String(buffer, 0, actualPerSize));
                    break;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
