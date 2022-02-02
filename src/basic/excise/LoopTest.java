package basic.excise;

/**
 * @Author: fujing
 * @Date: 2022/2/2
 * @Description:
 * @Version: 1.0
 */
public class LoopTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            do {
                i++;
                if (i % 2 != 0) {
                    sum += i;
                }
            } while (i < 6);
            System.out.println("=");
        }
        System.out.println(sum);

    }

}
