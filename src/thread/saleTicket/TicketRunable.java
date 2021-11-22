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
public class TicketRunable implements Runnable {
    private int ticke = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticke > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖出第:" + ticke-- + ":张票");
            }
        }
    }

    public static void main(String[] args) {
        TicketRunable ticketRunable = new TicketRunable();
        Thread thread1 = new Thread(ticketRunable);
        Thread thread2 = new Thread(ticketRunable);
        Thread thread3 = new Thread(ticketRunable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
