package lambda;

/**
 * @Author: fujing
 * @Date: 2021/12/26
 * @Description:
 * @Version: 1.0
 */

import lambda.why.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * lambda表达式的使用场景：任何 有 函数式接口 的地方
 * <p>
 * 什么是函数式接口？---只有一个抽象方法的接口（Object类中的方法除外），一般会使用注解 @FunctionalInterface 标记
 * <p>
 * 使用lambda的好处？
 * 1、替代 只有一个方法的接口实现，告别匿名内部类，使代码更简洁；
 * 2、lambda表达式还提升了对集合
 */
public class LambdaDemo {
    public static void main(String[] args) {
/*        //方式一：匿名内部类
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running1....");
            }
        });
        thread.start();

        //方式二：lambda表达式
        new Thread(() -> {
            System.out.println("lambda running...");
        }).start();

        //lambda简写
        new Thread(() -> System.out.println("简化lambda写法 running。。。。")).start();*/


        //案例二：比较排序输出
        List<String> stringList = Arrays.asList("一二三四五六", "123456789", "你哈", "大王叫我来");
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //比较的规则：按字符串长度进行比较
                return o1.length() - o2.length();
            }
        });
        //查看排序结果
        for (String s : stringList) {
            System.out.println(s);
        }


        System.out.println("-----------集合元素排序之lambda---------------");


        //方式二：lambda写法
        stringList.sort((a,b) -> {return a.length() - b.length();});
//        stringList.sort(Comparator.comparingInt(String::length));
        stringList.forEach(System.out::println);

    }
}
