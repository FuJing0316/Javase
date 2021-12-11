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
public class ScheduleThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        System.out.println("begin--" + System.currentTimeMillis());//第一个线程开始前输出

        for (int i = 0; i < 20; i++) {
            scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程任务提交后，延迟3秒执行====");
                    System.out.println("run end:" + System.currentTimeMillis());//每个线程执行结束输出
                }
            }, 3000, TimeUnit.MILLISECONDS);
        }

        //关闭线程池
        scheduledExecutorService.shutdown();
    }
}
