package thread.threadpool.category;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: fujing
 * @Date: 2021/12/11
 * @Description:
 * @Version: 1.0
 */

/**
 * newSingleThreadExecutor(): 创建一个使用单个worker工作的线程池，以无界队列的形式运行该线程（注意：如果因为在线程池关闭前任务执行失败而终止了
 * 该线程，那么如果需要，会重新新建一个线程，来代替它执行后续任务）。该类线程池可以保证顺序的执行任务，且给定的任意时间不会同时有多个线程执行任务。
 * <p>
 * <p>
 * 特点：
 * 1、线程池中最多执行一个线程，之后提交的线程任务都会在队列中等候。
 */
public class SingerThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new RunableTask());
        for (int i = 0; i < 20; i++) {
            Future<?> submit = executorService.submit(new RunableTask());//submit 和 execute 用哪个，看你需不需要返回值。二者都可以提交任务。
        }

        //关闭线程池
        executorService.shutdown();


    }
}
