package thread.demo;

/**
 * @Author: fujing
 * @Date: 2021/11/21
 * @Description:
 * @Version: 1.0
 */
public class RunableThreadDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("自定义线程名称:" + Thread.currentThread().getName() + ",线程id:" + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) {
        RunableThreadDemo runableThreadDemo = new RunableThreadDemo();
        Thread thread = new Thread(runableThreadDemo);//自定义线程
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程和自定义线程，谁先执行？主线程：" + Thread.currentThread().getName() + "===========" + i);
        }
    }
}
