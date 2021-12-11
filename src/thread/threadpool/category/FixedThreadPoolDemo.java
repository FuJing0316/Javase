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
