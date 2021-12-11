package thread.threadpool.category;

/**
 * @Author: fujing
 * @Date: 2021/12/7
 * @Description:
 * @Version: 1.0
 */
public class RunableTask implements Runnable {

    @Override
    public void run() {
        /**
         * 此处的睡眠： 是为了看清线程是否复用
         * 每个线程执行执行run()方法消耗的时间越长，线程池中空闲线程就越少（每个任务都需要创建新线程去执行任务）
         */
/*        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println(Thread.currentThread().getName() + " running");
    }
}
