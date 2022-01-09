package lambda.function_ref;

/**
 * @Author: fujing
 * @Date: 2022/1/8
 * @Description:
 * @Version: 1.0
 */

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  方法的引用： 是直接访问类或实例中已存在的方法或构造方法 的一种方式（它是一种只引用但不执行的方式）。
 *              如果函数式接口的抽象方法的实现，恰好可以通过调用另一个已存在的方法 来实现，那么就有可能使用方法的引用。
 *
 */
public class StaticMethod_ref {
    public static void main(String[] args) {
//---------------------------静态方法的引用----------------------------
        //lambda表达式写法
        Supplier<String> supplier = ()-> StaticMethod_ref.getName();
        System.out.println(supplier.get());
        //静态方法引用 写法
        Supplier<String> supplier2 = StaticMethod_ref::getName;
        System.out.println(supplier2.get());

        //以下lambda写法和静态方法引用写法等价
        Supplier<String> supplier3 = ()-> Person.getName();
        Supplier<String> supplier4 = Person::getName;//静态方法引用写法，只调用不执行
        System.out.println("supplier3--"+supplier3.get());//执行方法
        System.out.println("supplier4--"+supplier4.get());


        //以下两种写法等价
        Function<Integer,String> function = (x)->Person.getNameByAge(x);
        System.out.println("function---"+function.apply(18));
        Function<Integer,String> function1 = Person::getNameByAge;//静态方法引用写法，只调用不执行
        System.out.println("function1---"+function1.apply(18));


        //以下两种写法等价
        BiFunction<String,String,Integer> biFunction = (a,b)-> getLength(a, b);//lambda写法
        BiFunction<String,String,Integer> biFunction1 = StaticMethod_ref::getLength;//方法引用写法
        System.out.println("biFunction--" + biFunction.apply("你好阿", "周末"));
        System.out.println("biFunction1--" + biFunction1.apply("你好阿", "周末"));

    }

    private static String getName() {
        return "lisa";
    }

    private static int getLength(String a,String b){ return a.length() + b.length();};

}

class Person{
    static String getName(){
        return "lambda person";
    }

    static String getNameByAge(Integer age) {
        if (age > 16) return "成年人";
        else return "未成年人";
    }

}


