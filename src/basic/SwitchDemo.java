package basic;

import java.util.Scanner;

/**
 * @Author: fujing
 * @Date: 2022/2/15
 * @Description:
 * @Version: 1.0
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请拨号：");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("拨的是爸爸的号");
                break;
            case 2:
                System.out.println("拨的是mama的号");
                break;
            case 3:
                System.out.println("拨的是yeye的号");
                break;
            case 4:
                System.out.println("拨的是nainai的号");
                break;
            default:
                System.out.println("号码有误");
                break;

        }

    }
}
