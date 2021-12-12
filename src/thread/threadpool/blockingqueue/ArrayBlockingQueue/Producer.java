package thread.threadpool.blockingqueue.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: fujing
 * @Date: 2021/12/12
 * @Description:
 * @Version: 1.0
 */
public class Producer implements Runnable {

    BlockingQueue<Goods> goodsBlockingQueue;

    Producer(BlockingQueue<Goods> goodsBlockingQueue) {
        this.goodsBlockingQueue = goodsBlockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                Goods goods = new Goods("娃哈哈", "矿泉水");
                System.out.println("生产者" + i + "生产了---" + goods.getBrand() + goods.getName());

                try {
                    goodsBlockingQueue.put(goods);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                Goods goods = new Goods("旺仔", "小馒头");//注意new的动作并不是一个原子操作，所以是有可能被其他线程打断，存在安全隐患的
                System.out.println("生产者" + i + "生产了---" + goods.getBrand() + goods.getName());

                try {
                    goodsBlockingQueue.put(goods);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
