package lambda.function_ref;

/**
 * @Author: fujing
 * @Date: 2022/1/8
 * @Description:
 * @Version: 1.0
 */

import com.sun.org.apache.xpath.internal.functions.Function3Args;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  方法的引用： 是直接访问类或实例中已存在方法的一种方式（它是一种只引用但不执行的方式）。
 *   如果函数式接口，抽象方法的实现，恰好可以通过调用另一个已存在的方法 来实现，那么就有可能使用方法的引用。
 *
 *    分类：
 *      静态方法的引用
 *      实例方法的引用
 *      对象方法的引用（跟实例方法区别？？  不常用）
 *      构造方法的引用
 */
public class Instance_method_ref {
    public static void main(String[] args) {
        //---------------------------实例方法的引用:非静态方法，需要new instance----------------------------
        //以下lambda表达式写法 和 实例方法引用的写法等价
        Supplier<String> supplier = ()->new Instance_method_ref().put();
        System.out.println("instance method ref ---supplier:" + supplier.get());
        Supplier<String> supplier1 = new Instance_method_ref()::put;//实例方法引用的写法
        System.out.println("instance method ref ---supplier1:"+supplier1.get());

        //以下两种写法等价
        Consumer<String> consumer = (x)->new Instance_method_ref().getSize(x);
        consumer.accept("你好加瓦");
        Consumer<String> consumer1 = new Instance_method_ref()::getSize;
        consumer1.accept("你好加瓦");

        //以下三种写法效果等价
        Function<String,String> function = (t)->{return new Instance_method_ref().toUpperCase(t);};
        Function<String,String> function2 = (t)-> new Instance_method_ref().toUpperCase(t);
        Function<String,String> function3 = new Instance_method_ref()::toUpperCase; //实例方法的引用
        System.out.println(function.apply("abc"));
        System.out.println(function2.apply("abc"));
        System.out.println(function3.apply("abc"));


    }

    private String put(){
        return "put...";
    }

    private void getSize(String str){
        System.out.println("size---" + str.length());
    }

    private String toUpperCase(String str){
        return str.toUpperCase();
    }

}
