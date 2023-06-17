package oop2.homework;

/**
 * @Author: fujing
 * @Date: 2022/2/8
 * @Description:
 * @Version: 1.0
 */
public abstract class MotorVehicle {
    private String no;
    private String brand;

    //根据租赁天数计算租金
    public abstract int calRent(int days);



}
