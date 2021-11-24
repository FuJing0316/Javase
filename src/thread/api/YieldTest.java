package thread.api;

/**
 * @Author: fujing
 * @Date: 2021/11/24
 * @Description:
 * @Version: 1.0
 */
public class YieldTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }

    public static void main(String[] args) {
        YieldTest yieldRunable = new YieldTest();
        Thread thread = new Thread(yieldRunable);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);

            //在i=2时，当前正在执行的线程（此处是main线程）愿意让出一次执行机会，让thread-0先执行，下一次 主线程和thread-0会继续随机抢占资源，谁先抢到谁执行
            if (i == 2) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + "礼让一次! 此时i=" + i);
            } else {
                System.out.println(Thread.currentThread().getName() + "===" + i);
            }
        }


    }
}
