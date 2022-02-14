package basic;

/**
 * @Author: fujing
 * @Date: 2022/2/14
 * @Description:
 * @Version: 1.0
 */

import java.util.Scanner;

/**
 * 打印斐波那契数列 ：
 * 特点：从1开始，第一，第二个为1，后面每个值等于前两位相加所得数
 */
public class Fabonacci {
    public static void main(String[] args) {

        //打印10个以内的斐波那契数列
        for (int i = 1; i <= 10; i++) {
            System.out.println(getNumber(i));
        }


    }

    /*
    递归函数：
        再程序运行过程中，有时需要调用程序本身，此时可以使用递归
        注意：
            再程序中，能不使用递归就不要使用递归
                使用递归的时候会加大资源的消耗
                如果递归的层次比较深，会造成栈溢出。 Exception in thread "main" java.lang.StackOverflowError
            如果不使用递归无法解决问题的话，就必须要使用递归
                比如：输出某个磁盘目录下的所有文件名称

    */
    private static int getNumber(int i) {
        //前两位都是1,后面每个数=前两个数之和
        if (i==1||i==2){
            return 1;
        }else{
            return getNumber(i-1) + getNumber(i-2);
        }

    }
}
