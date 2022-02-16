package basic;

import java.util.Scanner;

/**
 * @Author: fujing
 * @Date: 2022/2/16
 * @Description:
 * @Version: 1.0
 */
public class Shopping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //购物总金额
        double totalAmt = 0.0;
        //单件商品小计
        double goodPrice = 0.0;

        int goodNo = 0;
        int num = 0;
        int runFlg = 0;

        while (0 == runFlg) {
            System.out.println("请输入要购买的商品编号：1-T恤；2-网球鞋；3-网球拍");
            goodNo = sc.nextInt();
            System.out.println("请输入购买数量：");

            num = sc.nextInt();

            goodPrice = getGoodPrice(goodNo, num, goodPrice);
            System.out.println("购买的商品：" + goodNo + "   购买数量：" + num + "   商品总价：" + goodPrice);

            totalAmt += goodPrice;

            System.out.println("\r\n" + "是否继续(0/1)：");
            runFlg = sc.nextInt();
        }

        System.out.println("\r\n" + "购物总金额：" + totalAmt);

    }

    private static double getGoodPrice(int goodNo, int num, double goodPrice) {
        if (goodNo == 1) {
            goodPrice = 50 * num;
        } else if (goodNo == 2) {
            goodPrice = 200 * num;
        } else if (goodNo == 3) {
            goodPrice = 150 * num;
        }
        return goodPrice;
    }
}
