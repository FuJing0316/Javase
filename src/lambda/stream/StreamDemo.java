package lambda.stream;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream Api:
 *      Stream的创建/生成
 *          1、List或数组 生成Stream ： 使用 stream.of(T...t) 返回元素是指定值的顺序排序流
 *          2、generate(Supplier<T> s)
 *
 *      stream的中间操作
 *          1、
 *
 *      stream的终止操作
 *          1、
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
        //Stream的生成方式
        gen1();
        gen2();



    }

    /**
     * 通过集合来生成
     */
    private static void gen2(){
        List<String> stringList = Arrays.asList("", "", "", "");
        Stream<String> stream = stringList.stream();
        stream.forEach(System.out::print);
    }

    /**
     * 通过数组生成stream :  Stream.of(T..values)  返回元素是指定值的顺序排序流
     */
    private static void gen1() {
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(System.out::print);
    }
}
