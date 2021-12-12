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

/**
 * AraayBlockingQueue VS LinkedBlockingQueue:  容量和锁数量有区别
 *  1、AraayBlockingQueue 出队入队使用同一把锁，适用于 出队或入队有高并发的场景。 容量为数组长度。
 *  2、LinkedBlockingQueue 出队、入队各用一把锁，适用于 出队入队 并发量都比较高的场景。 容量未指定的话，默认int最大值，可看作无界。
 *
 */
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<Goods> goodsBlockingQueue = new ArrayBlockingQueue<>(5);

        new Thread(new Producer(goodsBlockingQueue)).start();
        new Thread(new Consumer(goodsBlockingQueue)).start();


    }

}
