package lambda.function_ref;

/**
 * @Author: fujing
 * @Date: 2022/1/8
 * @Description:
 * @Version: 1.0
 */

import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  方法的引用： 是直接访问类或实例中已存在方法的一种方式（它是一种只引用但不执行的方式）。
 *   如果函数式接口，抽象方法的实现，恰好可以通过调用另一个已存在的方法 来实现，那么就有可能使用方法的引用。
 *
 */
public class Test1 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {return "supplier~";};  //->后花括号中的内容，就是函数式接口抽象方法get()的实现。
        System.out.println(supplier.get());

        Function<String,String> function = (a)->{return a+"哈哈~";};
        System.out.println(function.apply("周末你好啊~"));

    }
}
