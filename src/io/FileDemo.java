package io;

import java.io.File;
import java.io.IOException;

/**
 * @Author: fujing
 * @Date: 2021/10/26
 * @Description:
 * @Version: 1.0
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
//        File file = new File("./src/abc.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //判断文件的属性，都会返回boolean类型的值
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        //删除指定路径文件
//        file1.delete();

        //判断当前文件是否存在
        System.out.println(file.exists());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径，如果文件路径中只包含文件名，则返回空（null）
        System.out.println(file.getParent());

        try {
            //返回文件绝对路径的规范格式
            System.out.println(file.getCanonicalPath());
            //返回操作系统的文件分割符
            System.out.println(File.separatorChar);
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}
