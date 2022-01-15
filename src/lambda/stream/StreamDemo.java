package lambda.stream;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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
 *      stream的中间操作 : 如果方法调用之后，返回的结果是 Stream 对象，就意味着是一个中间操作
 *          常用中间操作：
 *              map、flatMap、filter、limit、skip、distinct、sorted()、sorted(Comparator<? super T> comparator)
 *
 *
 *
 *      stream的终止操作：
 *          1、
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
//---------------------------Stream的生成------------------------
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();
//        gen6();

//---------------------------Stream的中间操作----------------------
        Stream<Integer> stream1 = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10, 10, 10).stream();
/*        stream1.map((x)-> x+1) //代表一个映射， 返回 把给定函数 应用于此流的元素之后 所得到的结果 组成的流
                .flatMap(t -> Stream.of(t)) //和 map 差不多. 区别类似 list.add 和list.addAll
                .filter(s -> s <= 5) //按指定函数（方法实现逻辑）过滤
                .limit(5) //限制
                .skip(1) //跳过
                .distinct() //去重
                .sorted() //自然排序
                .sorted(Integer::compareTo) //自定义排序
                .forEach(System.out::println); //最后一步，是终止操作 ，循环输出 前几步处理过的 流中元素*/

        //api分步使用
        Stream<Integer> stream = Arrays.asList(11,12,13,14,15,15,16,16,17,18,18).stream();

        //map(Function<? super T, ? extends R> mapper) ： 返回把给定函数 应用于此流的元素 之后所得到的结果 组成的流
/*        Stream<Integer> integerStream = stream.map(x -> {
            return x + 1;
        });
        integerStream.forEach(System.out::println);*/

        //filter(Predicate<? super T> predicate)  过滤满足 条件函数 的元素
        Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> x % 2 == 0).forEach(System.out::print);
        System.out.println("\n" + "-------------------------");

        //统计集合中偶数的个数
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x) -> x % 2 == 0).mapToInt(x -> x).forEach(System.out::print);
        long count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x) -> x % 2 == 0).mapToInt(x -> x).count();
        System.out.println(count);





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
