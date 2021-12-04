package thread.pc1;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description: 生产者消费者模型：理想结果-生产者完整生产出一种商品，消费者对应完整取出对应的产品。
 * @Version: 1.0
 */

/**
 * 生产者消费者模型 测试 v1: 多次执行结果中 出现的问题：
 * <p>
 * 1、生产者还没生产出商品，消费者抢先取走了商品（不符合现实逻辑）
 * 2、生产者生产的产品，品牌名称 不一致（因为生产者生产的过程，有可能被其他线程抢先执行）
 */
public class TestPc {
    public static void main(String[] args) {

        Good good = new Good();//多线程执行的过程，对共享资源good的操作出现了数据安全问题

        Thread producer = new Thread(new Producer(good));
        producer.start();

        Thread consumer = new Thread(new Consumer(good));
        consumer.start();

    }

}
