package thread.api;

/**
 * @Author: fujing
 * @Date: 2021/11/24
 * @Description:
 * @Version: 1.0
 */
public class SleepTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "====" + i);
        }
    }


    public static void main(String[] args) {

        SleepTest sleepRunable = new SleepTest();
        Thread thread = new Thread(sleepRunable);
        thread.start();


        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "====" + i);

            //在i=2时，当前正在执行的线程（主线程main）会先sleep一段时间（阻塞），此时其他线程会去抢占cpu执行机会，main线程sleep时间到后，会重新进入就绪队列，抢占机会执行
            if (i == 2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
