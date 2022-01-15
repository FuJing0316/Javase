package lambda.stream;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream Api:
 * Stream的创建/生成
 * 1、Stream.of(T..values)  返回元素是指定值的顺序排序流
 * 2、list.stream()
 * 3、Arrays.stream(T[] array)
 * 4、Stream.generate(Supplier<T> s)
 * 5、iterate(final T seed, final UnaryOperator<T> f)
 * 6、其他方式。。。
 * <p>
 * <p>
 * stream的中间操作 : 如果方法调用之后，返回的结果是 Stream 对象，就意味着是一个中间操作
 * 常用中间操作：
 * map、flatMap、filter、limit、skip、distinct、sorted()、sorted(Comparator<? super T> comparator)
 * <p>
 * stream的终止操作：
 * reduce （归约）：将流中元素反复结合起来得到一个值
 * collect（收集）：将流转换为其他形式。需要Collectors类的一些方法
 * <p>
 * allMatch
 * anyMatch
 * noneMatch
 * findFirst
 * findAny
 * count()
 * max()
 * min()
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
        stream1.map((x) -> x + 1) //代表一个映射， 返回 把给定函数 应用于此流的元素之后 所得到的结果 组成的流
                .flatMap(t -> Stream.of(t)) //和 map 差不多. 区别类似 list.add 和list.addAll
                .filter(s -> s <= 5) //按指定函数（方法实现逻辑）过滤
                .limit(5) //限制
                .skip(1) //跳过
                .distinct() //去重
                .sorted() //自然排序
                .sorted(Integer::compareTo) //自定义排序
                .forEach(System.out::println); //最后一步，是终止操作 ，循环输出 前几步处理过的 流中元素

        //api分步使用
        Stream<Integer> stream = Arrays.asList(11, 12, 13, 14, 15, 15, 16, 16, 17, 18, 18).stream();

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
        System.out.println("\n" + "-------------------------");
        long count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x) -> x % 2 == 0).mapToInt(x -> x).count();
        System.out.println(count);

        //计算集合中偶数之和
        System.out.println("-------------------------");
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x) -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);

        //集合元素--每个加1--去重--求和
        System.out.println("-------------------------");
        int sum1 = Stream.of(1, 2, 2, 5, 5, 6, 7).mapToInt(x -> x + 1).distinct().sum(); //mapToInt  将集合中每个元素映射成 int，返回一个stream
        System.out.println("sum1:" + sum1);


//---------------------------Stream的终止操作----------------------
        /**
         * 常用终止操作 Api
         */
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(stream2.allMatch((x) -> x == 10));  // 检查是否匹配所有元素 boolean
        System.out.println(stream2.anyMatch(((x) -> x > 5))); // 检查是否至少匹配一个元素
        System.out.println(stream2.noneMatch((x) -> x > 500)); //检查是否没有匹配所有元素
        System.out.println(stream2.findFirst()); // 返回第一个元素Optional[1]
        System.out.println(stream2.findAny()); // 返回当前流中的任意一个元素;
        System.out.println(stream2.count()); // 返回流中元素的总个数);
        Optional<Integer> max = stream2.max(Integer::compareTo); // 返回流中最大值
        System.out.println("max " + max.get());
        Optional<Integer> min = stream2.min(Integer::compareTo);//返回流中最小值
        System.out.println("min " + min.get());



        /**
         * reduce （归约）：将流中元素反复结合起来得到一个值
         */
        Integer reduce = stream2.map(s -> (s + 1)).reduce(0, (integer1, integer2) -> integer1 + integer2);
        //归约：0为第一个参数x的默认值，x是计算后的返回值，y为每一项的值。
        System.out.println(reduce);
        Optional<Integer> reduce1 = stream2.map(s -> (s + 1)).reduce((x, y) -> x + y);
        // x是计算后的返回值，默认为第一项的值，y为其后每一项的值。
        System.out.println(reduce1.get());
        //求和
//        BigDecimal bigDecimal = orderInfos.stream().map(OrderInfoReq::getMoney).reduce(BigDecimal::add).get();


        /**
         * collect（收集）：将流转换为其他形式。需要Collectors类的一些方法
         */
        Set<Integer> collect = stream2.collect(Collectors.toSet());
        List<Integer> collect2 = stream2.collect(Collectors.toList());
        HashSet<Integer> collect1 = stream2.collect(Collectors.toCollection(HashSet::new));
        //分组 {group=[1, 2, 3, 4...]}
        Map<String, List<Integer>> collect3 = stream2.collect(Collectors.groupingBy((x) -> "group"));//将返回值相同的进行分组
        System.out.println("collect3--分组:" + collect3);

        //分区 {false=[1, 2, 3, 4], true=[5, 6, 7, 8, 9, 10, 10]}
        Map<Boolean, List<Integer>> collect5 = stream2.collect(Collectors.partitioningBy((x) -> x >= 5));
        System.out.println("collect5:" + collect5);

        //汇总： 最大值、最小值、平均值、个数
        DoubleSummaryStatistics collect6 = stream2.collect(Collectors.summarizingDouble((x) -> x));
        System.out.println(collect6.getMax());
        System.out.println(collect6.getCount());


    }


    private static void gen6() {
        String str = "hello ll";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);//输出每个元素对应的int值 （ascii码）
    }


    /**
     * 生成 5、iterate(final T seed, final UnaryOperator<T> f)
     */
    private static void gen5() {
        Stream<String> iterate = Stream.iterate("h", (x) -> {
            return x.concat("_stream_test");
        });

        iterate.limit(2).forEach(System.out::println);
    }


    /**
     * 生成 4、 Stream.generate(Supplier<T> s)
     */
    private static void gen4() {
        Stream<Integer> generate = Stream.generate(() -> {
            int a = 15;
            return a;
        });
        generate.limit(5).forEach(System.out::println);
    }

    /**
     * 生成 3、Arrays.stream(T[] array)
     */
    private static void gen3() {
        Stream<String> stream = Arrays.stream(new String[1]);
        stream.forEach(System.out::println);
    }

    /**
     * 生成 2、list.stream()
     */
    private static void gen2() {
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
