package lambda.lambda_exec;

/**
 * @Author: fujing
 * @Date: 2022/1/5
 * @Description:
 * @Version: 1.0
 */

import java.util.concurrent.Callable;

/**
 * Lambda
 */
public class LambdaTest {
    public static void main(String[] args) throws Exception {
        /**
         * 以函数式接口 Runnable为例，展示 lambda写法：
         *    1.以下v1、v2、v3 三种写法，是等价的
         *    2.Runnable 的 run()方法没有返回值
         */
        /*v1*/
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running1....");
            }
        };
        runnable1.run();
        /*v2*/
        Runnable runnable2 = () -> {
            System.out.println("running2....");
        };
        runnable2.run();
        /*v3*/
        Runnable runnable3 = () -> System.out.println("running3....");
        runnable3.run();

        //--------------------------------------------------------------------

        /**
         * 函数式接口 Callable 中的 call()方法，有返回值
         */
        Callable callable = new Callable() {
            @Override
            public String call() throws Exception {
                return "call...";
            }
        };
        System.out.println(callable.call());

        Callable callable1 = ()->{return "call1...";};
        System.out.println(callable1.call());

        Callable callable2 = ()->"call2...";
        System.out.println(callable2.call());

        //--------------------------------------------------------------------





    }
}
