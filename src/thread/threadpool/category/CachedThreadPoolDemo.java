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
 * 线程池 类别1：newCachedThreadPool
 * 特点：
 * 1、
 */
public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //提交待执行任务
        executorService.execute(new RunableTask());
        //关闭线程池
        executorService.shutdown();
    }
}
