package thread.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description:
 * @Version: 1.0
 */
public class ProducerQueue implements Runnable {

    BlockingQueue<Good> blockingQueue;

    ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        Good good = null;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                good = new Good("娃哈哈", "矿泉水");
            } else {
                good = new Good("旺仔", "小馒头");
            }
            System.out.println("生产者生产了：" + good.getBrand() + "--" + good.getName());

            try {
                blockingQueue.put(good);//将生产的good放入队列中 （BlockingQueue 内部实现了线程安全保证）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
