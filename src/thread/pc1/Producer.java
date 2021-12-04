package thread.pc1;

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

            //偶数，生产娃哈哈矿泉水， 否则，生产旺仔小馒头
            if (i % 2 == 0) {
                good.setBrand("娃哈哈");
                try {
                    Thread.sleep(200);//此处睡眠是为了模拟出：一个品牌的生产过程可能被其他线程打断
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                good.setName("矿泉水");
            } else {
                good.setBrand("旺仔");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                good.setName("小馒头");
            }

            System.out.println("生产者生产了：" + good.getBrand()+"--"+ good.getName());
        }

    }
}
