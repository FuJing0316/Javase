package oop2.homework;

/**
 * @Author: fujing
 * @Date: 2022/2/8
 * @Description: 轿车
 * @Version: 1.0
 */
public class Car extends MotorVehicle {

    /**
     *   类型： 1-别克商务舱GL8；2-宝马550i；3-别克林荫大道
     *   别克商务舱GL8   宝马550i  别克林荫大道
     *    600            500        300
     */
    private String type;//轿车类型（区别父类中的共有属性：品牌、NO）

    public Car() {
    }

    public Car(String type) {
        this.type = type;
    }

    @Override
    public int calculateRent(int days) {
        if ("1".equals(type)) {
            return 600 * days;
        } else if ("2".equals(type)) {
            return 500 * days;
        }else if ("3".equals(type)){
            return 300 * days;
        } else {
            System.out.println("车型不正确");
            return 0;
        }
    }

}
