package thread.threadpool.category;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: fujing
 * @Date: 2021/12/10
 * @Description:
 * @Version: 1.0
 */

/**
 * newFixedThreadPool：创建一个线程数固定可重用的线程池，以共享无界队列的方式来运行这些线程。
 * 特点：
 * 1、线程池中的线程数量是固定的，可以很好的控制线程的并发量；
 * 2、线程可以被重复使用，在显示的关闭线程池之前，这些线程一直存活；
 * 3、超出指定量的线程任务被提交时，需要在无界队列中等待。
 *
 * 使用注意点： 实际使用，线程池固定线程数的指定，非常考研对业务并发量的了解程度。。。
 */

public class FixedThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
//            executorService.execute(new RunableTask());//Executor.excute（runabletask） 没有返回值
            Future<?> submit = executorService.submit(new RunableTask());//返回待执行的任务
        }

        //关闭线程池
        executorService.shutdown();
    }
}
