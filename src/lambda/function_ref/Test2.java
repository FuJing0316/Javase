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
 *  方法的引用： 是直接访问类或实例中已存在的方法或构造方法 的一种方式（它是一种只引用但不执行的方式）。
 *              如果函数式接口的抽象方法的实现，恰好可以通过调用另一个已存在的方法 来实现，那么就有可能使用方法的引用。
 *
 */
public class Test2 {
    public static void main(String[] args) {
//---------------------------静态方法的引用----------------------------
        //lambda表达式写法
        Supplier<String> supplier = ()->Test2.getName();
        System.out.println(supplier.get());
        //静态方法引用 写法
        Supplier<String> supplier2 = Test2::getName;
        System.out.println(supplier2.get());
//---------------------------实例方法的引用----------------------------







    }

    private static String getName() {
        return "lisa";
    }
}
