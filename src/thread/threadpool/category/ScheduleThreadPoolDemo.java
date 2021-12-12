package thread.threadpool.category;

import java.sql.SQLOutput;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: fujing
 * @Date: 2021/12/11
 * @Description:
 * @Version: 1.0
 */

/**
 * ScheduledThreadPoolExecutor，可以在指定延迟后 或 定时执行提交到线程池中的定时任务。有两种创建方式
 *      newScheduledThreadPool(int coreThreads) : 创建一个指定线程数量的线程池，即使是空线程也将保留。
 *      newSingleThreadshceduledPool():创建一个单线程执行的线程池。
 * <p>
 * <p>
 * ScheduledThreadPoolExecutor特点：
 *      可以延迟指定时间、或定时执行线程活动。
 */

public class ScheduleThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        System.out.println("begin--" + System.currentTimeMillis());//第一个线程开始前输出


//        /**
//         * 在指定延迟时间后执行线程任务
//         */
//        for (int i = 0; i < 20; i++) {
//            scheduledExecutorService.schedule(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("线程任务提交后，延迟3秒执行====");
//                    System.out.println("run end:" + System.currentTimeMillis());//每个线程执行结束输出
//                }
//            }, 3000, TimeUnit.MILLISECONDS);
//        }

        /**
         * 定期执行线程任务：
         */
        for (int i = 0; i < 20; i++) {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println("定期执行线程任务：首次执行延迟一秒，其后每3秒执行一次。。。");
                    System.out.println("run end:" + System.currentTimeMillis());//每个线程执行结束输出
                }
            }, 1, 3, TimeUnit.SECONDS);
        }


//        //关闭线程池
//        scheduledExecutorService.shutdown();
    }
}
