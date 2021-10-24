package collection;

/**
 * @Author: fujing
 * @Date: 2021/10/24
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        test.subInter test = new test.subInter() {
            @Override
            public String method2() {
                return "123";
            }
        };

    }
}
