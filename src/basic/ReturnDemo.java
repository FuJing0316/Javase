package basic;

/**
 * @Author: fujing
 * @Date: 2022/2/13
 * @Description:
 * @Version: 1.0
 */

/**
 * return的两种基本用法：
 * 1、返回方法的返回值；
 * 2、返回返回值。
 *
 *
 *
 */
public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println(get());
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;//结束方法
            } else {
                System.out.println("继续执行，当前i="+i);
            }
        }
    }

    public static int get() {
        return 100;//放回方法的返回值
    }
}
