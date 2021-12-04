package thread.pc2;

/**
 * @Author: fujing
 * @Date: 2021/12/3
 * @Description:
 * @Version: 1.0
 */
public class Good {

    private String brand;
    private String name;

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

    //此处保证了一个商品生产的过程的完整性，不会被其他线程打断，不会出现商品品牌名称不一致的情况
    public synchronized void porduceGood(String brand, String name) {
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了：" + this.getBrand() + "--" + this.getName());
    }


    public synchronized void get() {
        try {
            Thread.sleep(200);//每个线程执行到此处，睡200毫秒，则给了其他线程抢夺资源的时机
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("消费者取走了商品：" + this.getBrand() + "---" + this.getName());
    }


    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
