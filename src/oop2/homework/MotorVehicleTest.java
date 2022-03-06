package oop2.homework;

/**
 * 某汽车租赁公司出租多种车辆，车型及租金情况如下：
 *                  轿车                                                客车（金杯、金龙）
 * 车型           别克商务舱GL8   宝马550i  别克林荫大道                   <=16座       >16座
 * 日租费(元/天)    600            500        300                         800         1500
 * <p>
 * <p>
 * 分析：
 * 发现类 --发现类的属性 --发现类的方法  --优化设计
 */
public class MotorVehicleTest {
    public static void main(String[] args) {

        //单个车，计算租X天的租金
//        calSingleRent();

        //多种交通工具组合，计算总租金
        MotorVehicle[] motorVehicles = new MotorVehicle[5];
        motorVehicles[0] = new Car("1");
        motorVehicles[1] = new Car("2");
        motorVehicles[2] = new Car("3");
        motorVehicles[3] = new Bus(16);
        motorVehicles[4] = new Bus(18);

        int totalRent = calTotalRent(motorVehicles, 1);
        System.out.println("几种车组合：" + motorVehicles.toString() + " 租X天的总租金是：" + totalRent);


    }


    //多种轿车组合，计算租X天的总租金
    private static int calTotalRent(MotorVehicle[] motorVehicles, int days) {
        int totalRent = 0;
        for (int i = 0; i < motorVehicles.length; i++) {
           totalRent += motorVehicles[i].calculateRent(days);
        }
        return totalRent;
    }


    private static void calSingleRent() {
        //轿车
        Car car = new Car("2");
        System.out.println(car.calculateRent(5));

        //汽车
        Bus bus = new Bus(18);
        System.out.println(bus.calculateRent(5));
    }
}
