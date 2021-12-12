package thread.threadpool.blockingqueue;

/**
 * @Author: fujing
 * @Date: 2021/12/12
 * @Description:
 * @Version: 1.0
 */


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 *  ArrayBlockingQueue： 一个对象数组 + 一把锁 + 两个条件
 *    入队与出队都用同一把锁
 *    在只有入队高并发 或 出队高并发的情况下，因为操作数组，且不需要扩容，性能很高
 *    采用了数组，必须指定大小，即容量有限
 *
 *  LinkedBlockingQueue： 一个单向链表 + 两把锁 + 两个条件
 *    两把锁，一把用于入队，一把用于出队，有效的避免了入队与出队时使用一把锁带来的竞争。
 *    在入队与出队都高并发的情况下，性能比ArrayBlockingQueue高很多
 *    采用了链表，最大容量为整数最大值，可看做容量无限
 *
 */
public class LinkedBlockingQueueTest {
    public static void main(String[] args) {

        BlockingQueue<Integer> integerBlockingQueue = new LinkedBlockingQueue<>();//未指定容量，则默认可放 Integer#MAX_VALUE
    }
}
