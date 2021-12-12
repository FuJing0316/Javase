package thread.threadpool.category.forkJoinPoolDemo;

/**
 * @Author: fujing
 * @Date: 2021/12/12
 * @Description:
 * @Version: 1.0
 */

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */

public class WorkStealingPoolTest {
    public static void main(String[] args) {
        //并行级别设置为2，即默认每时每刻只有两个线程同时执行
        ExecutorService executorService = Executors.newWorkStealingPool(2);
        for (int i = 0; i <= 10; i++) {

            final int count = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    Date now = new Date();
                    System.out.println("线程" + Thread.currentThread().getName() + "完成任务："
                            + count + "   时间为：" + now.getSeconds());
                    try {
                        Thread.sleep(1000);//此任务耗时1s,此时会创建另一线程去执行功能
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }

        while (true) {
            //主线程陷入死循环，来观察结果，否则是看不到结果的
        }

    }
}
