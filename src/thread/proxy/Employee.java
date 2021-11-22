package thread.proxy;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description:
 * @Version: 1.0
 */
public class Employee implements KindPerson {
    @Override
    public void appeal() {
        System.out.println("员工在申述");
    }

    @Override
    public void proof() {
        System.out.println("员工在举证");
    }
}
