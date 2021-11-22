package thread.proxy;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description: 被代理人：Boss
 * @Version: 1.0
 */
public class Boss implements KindPerson {
    @Override
    public void appeal() {
        System.out.println("被告Boss提起了申述");
    }

    @Override
    public void proof() {
        System.out.println("被告Boss在举证");
    }
}
