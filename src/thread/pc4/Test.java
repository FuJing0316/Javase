package thread.pc4;

import thread.pc3.Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description:
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        BlockingQueue<Good> blockingQueue = new ArrayBlockingQueue<>(1);
        ProducerQueue producerQueue = new ProducerQueue(blockingQueue);
        ConsumerQueue consumerQueue = new ConsumerQueue(blockingQueue);

        Thread producer = new Thread(producerQueue);
        Thread consumer = new Thread(consumerQueue);

        producer.start();
        consumer.start();


    }
}
