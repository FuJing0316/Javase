package io.file;

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

        //无论文件是否存在，都可以获得文件的路径
//        File  file1 = new File("c:/a.txt");
        File file1 = new File("abc.txt");
        System.out.println(file1.getAbsolutePath());

        //判断是文件还是目录
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());


        //File.listFiles() 用的比较多
        File file2 = new File("c:/f/g/h");
        String[] list = file2.list();
/*        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");*/
        File[] files = file2.listFiles();
/*        for (File f : files) {
            System.out.println(f);
        }*/

        //打印当前系统的所有盘符
        File[] fs = File.listRoots();
        for (File f : fs) {
            System.out.println(f);
        }

        //创建单级目录
        file2.mkdir();
        //创建多级目录
        file2.mkdirs();


        /**
         * 问题： 循环遍历输出 c:/d/ 目录下的所有文件的绝对路径
         *       递归实现（因为不知道循环多少次，所以无法循环遍历输出。但是，一般递归要慎用，因为递归如果没有合适的出口的话，很容易超出栈的最大深度）
         */
        printFile(new File("C:\\D\\00--面试\\00-我的简历"));


    }


    /**
     * 注意点：文件在遍历的时候，有时候会报空指针，原因在于当前文件受系统保护，没有访问权限，此时会报空指针
     *
     * @param file
     */
    private static void printFile(File file) {
        if (file.isFile()) {
            System.out.println("这是一个具体文件，只有文件名称：" + file.getAbsolutePath());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                printFile(f);
            }
        }
    }

}
