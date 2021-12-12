package thread.threadpool.blockingqueue.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: fujing
 * @Date: 2021/12/12
 * @Description:
 * @Version: 1.0
 */

/**
 * ArrayBlockingQueue :  基于数组实现的定长的有界阻塞队列
 *
 * 阻塞队列： 内部会维护一个有先后顺序的等待队列，任务进入等待队列后，使用的是同一把锁。
 *
 * 根据构造方法参数的设置，可以设置锁机制（公平锁/非公平锁），默认非公平锁，即谁先抢到，谁现执行。
 */
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<Goods> goodsBlockingQueue = new ArrayBlockingQueue<>(5);

        new Thread(new Producer(goodsBlockingQueue)).start();
        new Thread(new Consumer(goodsBlockingQueue)).start();


    }

}
