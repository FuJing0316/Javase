package oop2.homework;

/**
 * @Author: fujing
 * @Date: 2022/2/8
 * @Description: 机动车
 * @Version: 1.0
 */
public abstract class MotorVehicle {

    private String brand;//品牌
    private String no;//车牌

    //按天计算租金
    public abstract int calculateRent(int days);

}
