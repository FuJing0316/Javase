package lambda.stream;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.util.Arrays;
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
        //通过数组生成stream
        String[] strings = {"a","b","c","d"};
        Stream<String> stream = Stream.of(strings);
        stream.forEach(System.out::print);


    }
}
