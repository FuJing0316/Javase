package oop2.homework;

/**
 * @Author: fujing
 * @Date: 2022/3/6
 * @Description:
 * @Version: 1.0
 */
public class Bus extends MotorVehicle {

    private int seatCount;//座位数

    public Bus() {
    }

    public Bus(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public int calculateRent(int days) {
        if (seatCount <= 16) {
            return 800 * days;
        } else if (seatCount > 16) {
            return 1500 * days;
        } else {
            System.out.println("座位数有误");
            return 0;
        }
    }
}
