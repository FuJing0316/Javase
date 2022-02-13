package oop2.homework;

/**
 * @Author: fujing
 * @Date: 2022/2/8
 * @Description: 轿车
 * @Version: 1.0
 */
public class Car extends MotorVehicle {

    private String type;

    public Car() {
    }

    public Car(String type) {
        this.type = type;
    }

    @Override
    public int calRent(int days) {
        if ("1".equals(type)) {
            return 700 * days;
        } else if ("2".equals(type)) {
            return 500 * days;
        } else {
            System.out.println("车型不正确");
            return 0;
        }
    }

}
