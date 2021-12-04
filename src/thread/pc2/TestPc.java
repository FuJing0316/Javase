package thread.pc2;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description: 生产者消费者模型：理想结果-生产者完整生产出一种商品，消费者对应完整取出对应的产品。
 * @Version: 1.0
 */

/**
 * 生产者消费者模型 测试 v2:
 * 解决V1问题，将共享资源 good 的生产和获取 过程 加锁，保证同一资源good的生产和获取的过程不会被打断， 不会再出现商品品牌名称不一致的情况
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
