package thread.pc1;

/**
 * @Author: fujing
 * @Date: 2021/12/3
 * @Description: 消费者线程:负责从共享空间取走生产者生产的商品
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
            try {
                Thread.sleep(200);//每个线程执行到此处，睡200毫秒，则给了其他线程抢夺资源的时机
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("消费者取走了商品：" + good.getBrand() +"---"+ good.getName());
        }
    }
}
