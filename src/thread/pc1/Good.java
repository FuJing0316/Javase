package thread.pc1;

/**
 * @Author: fujing
 * @Date: 2021/12/3
 * @Description: 线程之生产者消费者模式练习
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

    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
