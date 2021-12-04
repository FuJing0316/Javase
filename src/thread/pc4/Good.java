package thread.pc4;

/**
 * @Author: fujing
 * @Date: 2021/12/4
 * @Description:
 * @Version: 1.0
 */
public class Good {

    private String brand;
    private String name;

    Good(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

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


}
