package basic;

import java.util.Scanner;

/**
 * @Author: fujing
 * @Date: 2022/2/16
 * @Description:
 * @Version: 1.0
 */

/**
 * 淡旺季机票的价格，原价机票价格为5000元，
 * ▪ 淡季头等舱打5折，经济舱打4折
 * ▪ 旺季头等舱打9折，经济舱打8折
 * ▪ 要求
 * ▪ 编写程序实现：
 * ▪ 输入任意的月份与舱位来计算机票的价格
 * ▪ 1代表头等舱，2代表经济舱
 * ▪ 4-10月为旺季，其他月份为淡季
 */
public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入仓型（1代表头等舱，2代表经济舱）：");
        int type = scanner.nextInt();

        //飞机价格
        double price = 0.0;
        if (month == 4 || month == 5 || month == 6 || month == 7) {
            if (type == 1) {
                //旺季头等舱
                price = 5000 * 0.9;
            } else {
                //旺季经济舱
                price = 5000 * 0.8;
            }
        } else {
            if (type == 1) {
                //淡季头等舱
                price = 5000 * 0.5;
            } else {
                //淡季经济舱
                price = 5000 * 0.4;
            }
        }

        System.out.println("购买机票的价格：==" + price);


        System.out.println("新分支上的修改");
    }
}
