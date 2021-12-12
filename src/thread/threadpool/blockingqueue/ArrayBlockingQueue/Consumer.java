package thread.threadpool.blockingqueue.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: fujing
 * @Date: 2021/12/12
 * @Description:
 * @Version: 1.0
 */
public class Consumer implements Runnable {

    BlockingQueue<Goods> goodsBlockingQueue;

    Consumer(BlockingQueue<Goods> goodsBlockingQueue) {
        this.goodsBlockingQueue = goodsBlockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Goods goods = goodsBlockingQueue.take();
                System.out.println("--消费者" + i + "取走了--" + goods.getBrand() + goods.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
