package basic;

/**
 * @Author: fujing
 * @Date: 2022/2/14
 * @Description:
 * @Version: 1.0
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
