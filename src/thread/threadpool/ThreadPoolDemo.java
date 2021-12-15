package thread.threadpool;

import java.util.concurrent.*;

/**
 * @Author: fujing
 * @Date: 2021/12/15
 * @Description:
 * @Version: 1.0
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //自定义线程池，注意几个参数的使用
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        //提交任务
        Future<String> submit = null;
        for (int i = 0; i < 10; i++) {
            submit = (Future<String>) threadPoolExecutor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return Thread.currentThread().getName() + "  +running";
                }
            });

            //获取执行结果
            try {
                System.out.println("submit--" + submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }

        threadPoolExecutor.shutdown();
    }
}
