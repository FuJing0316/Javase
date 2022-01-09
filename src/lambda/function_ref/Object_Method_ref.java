package lambda.function_ref;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.util.function.BiConsumer;
import java.util.function.Consumer;

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
public class Object_Method_ref {
    public static void main(String[] args) {
//---------------------------对象方法引用----------------------------
        Consumer<String> consumer = (x)-> new Foo().put(x);
        consumer.accept("123");

        Consumer<String> consumer2 = (x)-> new Foo2().put(x);
        consumer2.accept("123");


        BiConsumer<Foo, String> consumer3 = (t1, t2)-> new Foo2().put(t2);
        consumer3.accept(new Foo(), "123");
    }
}


class Foo{
    public void put(String str){
        System.out.println("Foo---" + str);
    }
}


class Foo2{
    public void put(String str){
        System.out.println("Foo2---" + str);
    }
}