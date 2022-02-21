package oop1.one;

import java.util.Scanner;

/**
 * @Author: fujing
 * @Date: 2022/2/21
 * @Description:
 * @Version: 1.0
 */
public class AdminastratorUpate {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String name = scanner.next();
            String pwd = "";
            System.out.println("请输入密码：");
            pwd = scanner.next();
            if (name.equals("张三") && pwd.equals("123456")) {
                admin.setName(name);
                admin.setPwd(pwd);
                System.out.println("更新成功：" + admin.toString());
                break;
            } else {
                System.out.println("用户名/密码输入错误，请重新输入");
            }
        }

    }
}
