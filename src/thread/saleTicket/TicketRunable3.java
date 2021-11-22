package thread.saleTicket;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description:
 * @Version: 1.0
 */
/**
 * 使用接口的方式，每次只创建了一个共享对象，所有的线程能够实现资源共享
 *      1、数据不一致的问题
 *          解决方法：线程同步
 *
 */
public class TicketRunable3 implements Runnable {

    private int ticke = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.sale();
        }
    }


    /**
     * 使用同步方法解决多线程不安全的问题
     */
    private synchronized void sale() {
        if (ticke > 0) {
            System.out.println(Thread.currentThread().getName() + "正在卖出第:" + ticke-- + ":张票");
        }
    }

    public static void main(String[] args) {
        TicketRunable3 ticketRunable = new TicketRunable3();
        Thread thread1 = new Thread(ticketRunable);
        Thread thread2 = new Thread(ticketRunable);
        Thread thread3 = new Thread(ticketRunable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
