package lambda.function_ref;

/**
 * @Author: fujing
 * @Date: 2022/1/8
 * @Description:
 * @Version: 1.0
 */

import java.util.function.Supplier;

/**
 *  方法的引用： 是直接访问类或实例中已存在方法的一种方式（它是一种只引用但不执行的方式）。
 *   如果函数式接口，抽象方法的实现，恰好可以通过调用另一个已存在的方法 来实现，那么就有可能使用方法的引用。
 *
 */
public class Instance_method_ref {
    public static void main(String[] args) {
        //---------------------------实例方法的引用:非静态方法，需要new instance----------------------------
        //以下lambda表达式写法 和 实例方法引用的写法等价
        Supplier<String> supplier = ()->new Instance_method_ref().put();
        System.out.println("instance method ref ---supplier:" + supplier.get());
        Supplier<String> supplier1 = new Instance_method_ref()::put;//实例方法引用的写法
        System.out.println("instance method ref ---supplier1:"+supplier1.get());




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
