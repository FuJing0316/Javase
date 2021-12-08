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

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(Thread.currentThread().getName() + " running");
    }
}
