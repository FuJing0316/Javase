package thread.threadpool.category;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: fujing
 * @Date: 2021/12/11
 * @Description:
 * @Version: 1.0
 */
public class SingleThreadScheduledPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        System.out.println("begin--" + System.currentTimeMillis());//第一个线程开始前输出

/*        //延迟一段时间执行
        for (int i = 0; i < 20; i++) {
            scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程任务提交后，延迟3秒执行====");
                    System.out.println("run end:" + System.currentTimeMillis());//每个线程执行结束输出
                }
            }, 3000, TimeUnit.MILLISECONDS);
        }*/



        /**
         * 定期执行线程任务：
         */
        for (int i = 0; i < 20; i++) {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println("定期执行线程任务：当前时间开始，每1秒执行一次");
                    System.out.println("run end:" + System.currentTimeMillis());//每个线程执行结束输出
                }
            }, System.currentTimeMillis(), 1000, TimeUnit.MILLISECONDS);
        }

        //关闭线程池
        scheduledExecutorService.shutdown();
    }
}
