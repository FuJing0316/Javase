package thread.threadpool.category;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: fujing
 * @Date: 2021/12/7
 * @Description:
 * @Version: 1.0
 */

/**
 * Executors : 一个工具/工厂类。提供了获取 Executor、ExecutorService、ScheduledExecutorService、ThreadFactory、Callable对象的一些方法。
 * newCachedThreadPool：
 * 当线程池里原有线程够用时，会先重用原有线程,当原有线程不够用时，会根据需要创建新线程（在需要创建线程时会使用ThreadFactory来进行创建）。
 *
 * 特点：
 * 1、线程池中的线程数不固定，最大线程数可以达到 Integer.MAX_VALUE；
 * 2、线程池中的线程可以缓存重复利用 或者 被回收（空闲线程默认的回收时间是1分钟）。
 * 3、当线程池中没有可用线程，会创建一个新线程
 *
 * 使用可能存在的问题：
 * 线程池中并发量无法控制。。。。。。
 *
 */
public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            //执行器执行任务
            executorService.execute(new RunableTask());
        }
        //关闭线程池
        executorService.shutdown();
    }
}
