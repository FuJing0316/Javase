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
public class TicketRunable2 implements Runnable {

    private int ticke = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            /**
             * 增加sleep一段时间，模拟出更真实场景。否则，会出现总是A抢到执行机会，其他BC线程无票卖出的情形。
             */
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            synchronized (this) {
                if (ticke > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖出第:" + ticke-- + ":张票");
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketRunable2 ticketRunable = new TicketRunable2();
        //用A、B、C三个线程，模拟三个售票窗口
        Thread thread1 = new Thread(ticketRunable,"A");
        Thread thread2 = new Thread(ticketRunable,"B");
        Thread thread3 = new Thread(ticketRunable,"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
