package thread.pc4;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description:
 * @Version: 1.0
 */
public class ConsumerQueue implements Runnable {

    BlockingQueue<Good> blockingQueue;

    ConsumerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Good good = blockingQueue.take(); //检索头部元素后删除，且返回该元素
                System.out.println("消费者消费的商品是：" + good.getBrand() + "--" + good.getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
