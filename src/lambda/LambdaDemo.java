package lambda;

/**
 * @Author: fujing
 * @Date: 2021/12/26
 * @Description:
 * @Version: 1.0
 */

/**
 * lambda表达式的使用场景：任何 有 函数式接口 的地方
 *
 * 什么是函数式接口？---只有一个抽象方法的接口（Object类中的方法除外）
 *
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //方式一：匿名内部类
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running1....");
            }
        });
        thread.start();


        //方式二：lambda表达式
        new Thread(()->{System.out.println("lambda running...");}).start();

        //lambda简写
        new Thread(()-> System.out.println("简化lambda写法 running。。。。")).start();
    }
}
