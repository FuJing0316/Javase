package thread.pc2;

/**
 * @Author: fujing
 * @Date: 2021/12/1
 * @Description: 生产者线程
 * @Version: 1.0
 */

/**
 * 生产者：负责生产商品，并放入共享空间中
 */
public class Producer implements Runnable {

    Good good;

    Producer(Good good) {
        this.good = good;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                good.porduceGood("娃哈哈", "矿泉水");
            } else {
                good.porduceGood("旺仔", "小馒头");
            }
        }
    }
}
