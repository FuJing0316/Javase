package thread.pc3;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description: 生产者消费者模型：理想结果-生产者完整生产出一种商品，消费者对应完整取出对应的产品。
 * @Version: 1.0
 */

/**
 * V3:
 * V1 出现的两个问题：1、产品未生产，消费者已取走；2、品牌和名称不一致
 * V2 的方式，可解决第二个问题，但第一个问题未解决
 *
 * V3解决思路，在V2基础上，解决V2遗留问题:
 *
 * 生产者：当生产者抢占到cpu资源之后会判断当前对象是否有值，如果有的话，以为着消费者还没有消费，需要提醒消费者消费，同时当前线程进入阻塞状态，等待消费者取走商品之后，再次生产，如果没有的话，不需要等待，不需要进入阻塞状态，直接生产即可;
 * 消费者：当消费者抢占到cpu资源后，首先去判断商品是否存在，商品不存在，则不能消费，当前线程阻塞，唤醒生产者线程去生产
 *
 */
public class TestPc {
    public static void main(String[] args) {

        Good good = new Good();

        Thread producer = new Thread(new Producer(good));
        producer.start();

        Thread consumer = new Thread(new Consumer(good));
        consumer.start();

    }

}
