package thread.pc2;

/**
 * @Author: fujing
 * @Date: 2021/12/3
 * @Description: 消费者线程：负责从共享空间取走生产者生产的商品
 * @Version: 1.0
 */
public class Consumer implements Runnable {

    private Good good;

    Consumer(Good good) {
        this.good = good;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            good.get();
        }
    }
}
