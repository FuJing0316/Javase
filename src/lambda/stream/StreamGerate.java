package lambda.stream;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream Api:
 *      Stream的创建/生成
 *          1、Stream.of(T..values)  返回元素是指定值的顺序排序流
 *          2、list.stream()
 *          3、Arrays.stream(T[] array)
 *          4、Stream.generate(Supplier<T> s)
 *          5、iterate(final T seed, final UnaryOperator<T> f)
 *          6、其他方式。。。
 *
 *
 *      stream的中间操作 : 一般，返回值依然为 Stream的  都是流的中间操作
 *          常见的中间操作：
 *
 *
 *
 *      stream的终止操作
 *          1、
 *
 */
public class StreamGerate {
    public static void main(String[] args) {
        //Stream的生成方式
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();
        gen6();

    }


    private static void gen6(){
        String str = "hello ll";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);//输出每个元素对应的int值 （ascii码）
    }


    /**
     * 生成 5、iterate(final T seed, final UnaryOperator<T> f)
     */
    private static void gen5(){
        Stream<String> iterate = Stream.iterate("h", (x) -> {
            return x.concat("_stream_test");
        });

        iterate.limit(2).forEach(System.out::println);
    }



    /**
     * 生成 4、 Stream.generate(Supplier<T> s)
     */
    private static void gen4(){
        Stream<Integer> generate = Stream.generate(() -> {
            int a = 15;
            return a;
        });
        generate.limit(5).forEach(System.out::println);
    }

    /**
     * 生成 3、Arrays.stream(T[] array)
     */
    private static  void gen3(){
        Stream<String> stream = Arrays.stream(new String[1]);
        stream.forEach(System.out::println);
    }

    /**
     * 生成 2、list.stream()
     */
    private static void gen2(){
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::print);
    }

    /**
     * 生成 1、Stream.of(T..values)  返回元素是指定值的顺序排序流
     */
    private static void gen1() {
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(System.out::print);
    }
}
