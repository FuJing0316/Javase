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
 *          1、通过数组生成stream ：  stream.of(T...t)
 *
 *
 *      stream的中间操作
 *
 *
 *      stream的终止操作
 *
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
        //stream的生成
        gen1();
        gen2();


    }

    /**
     *  通过集合来生成
     */
    private static void gen2() {
        List<String> list = Arrays.asList("1", "2", "3");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);
    }



    /**
     * 通过数组生成stream
     */
    private static void gen1() {
        String[] strings = {"a","b","c","d"};
        Stream<String> stream = Stream.of(strings);
        stream.forEach(System.out::print);
    }
}
