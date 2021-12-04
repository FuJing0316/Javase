package thread.pc3;

/**
 * @Author: fujing
 * @Date: 2021/12/3
 * @Description:
 * @Version: 1.0
 */
public class Good {

    private String brand;
    private String name;

    //增加商品是否存在标志：默认商品不存在
    private boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //生产者生产商品
    public synchronized void porduceGood(String brand, String name) {

        //执行到此处表示生产者抢占到了cpu资源，此时，要判断当前共享资源good是否存在：
        // 如果存在，则认为消费者还没消费，需要通知消费者消费，当前线程阻塞，直到消费者取走了商品，再次生产
        // 如果不存在，则直接生产
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //商品生产
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了：" + this.getBrand() + "--" + this.getName());

        //代码执行到此处，一个商品生产完成，此时商品存在标识要修改，并且要通知消费者线程去消费
        flag = true;
        //唤醒消费者线程去消费
        this.notify();

    }




    //消费者取走商品
    public synchronized void get() {

        /**
         * 当消费者线程抢到了cpu执行机会，首先判断商品对象是否存在：
         * 如果存在（flag==true），直接消费
         * 如果不存在，消费者线程应该阻塞，唤醒生产者去生产
         *
         */
        if (!flag){
            //flag=false，会执行进来，表示商品不存在
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(200);//每个线程执行到此处，睡200毫秒，则给了其他线程抢夺资源的时机
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("消费者取走了商品：" + this.getBrand() + "---" + this.getName());

        //消费者取走商品，flag置为false
        flag = false;
        //唤醒生产者线程去生产
        this.notify();
    }





    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
