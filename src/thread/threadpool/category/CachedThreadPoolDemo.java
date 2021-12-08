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
 * 当线程池里原有线程够用，会先重用原有线程,在原有线程不够用时，会根据需要创建新线程，
 *
 * 特点：
 * 1、
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
