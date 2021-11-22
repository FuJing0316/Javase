package thread.saleTicket;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description:
 * @Version: 1.0
 */
public class TicketThread extends Thread {
    //每个线程卖的是同一批票 ，所以static
    private static int ticke = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticke > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖出第:" + --ticke + ":张票");
            }
        }
    }

    public static void main(String[] args) {
        //此处创建了3个不同的线程对象
        TicketThread ticketThread1 = new TicketThread();
        TicketThread ticketThread2 = new TicketThread();
        TicketThread ticketThread3 = new TicketThread();
        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();
    }
}
