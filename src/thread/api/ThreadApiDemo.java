package thread.api;

/**
 * @Author: fujing
 * @Date: 2021/11/23
 * @Description:
 * @Version: 1.0
 */
public class ThreadApiDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }


    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取线程名称
        System.out.println(thread.getName());//main
        //获取线程Id
        System.out.println(thread.getId());//1
        //获取线程状态
        System.out.println(thread.getState());//RUNNABLE

        //获取线程执行优先级:在一般系统中范围是0-10的值，如果没设置的话，新建线程默认跟主线程优先级相等！！！！！！！（有些系统范围是0-100）
        System.out.println(thread.getPriority());//5

        /**
         * 1、线程优先级可设置
         * 2、优先级越高，一定会优先执行吗？不一定，只是优先执行的概率比较大而已。
         *
         */
        thread.setPriority(6);
        System.out.println(thread.getPriority());//6


        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread thread1 = new Thread(threadApiDemo);
        //判断线程是否活着
        System.out.println("thread1.isAlive: " + thread1.isAlive());//false
        thread1.start();
        System.out.println("thread1.isAlive: " + thread1.isAlive());//true
        System.out.println("thread1.getPriority: " + thread1.getPriority());//6

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }

    }


}
