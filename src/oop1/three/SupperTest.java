package oop1.three;

import javax.management.remote.rmi._RMIConnection_Stub;

/**
 * @Author: fujing
 * @Date: 2022/2/27
 * @Description:
 * @Version: 1.0
 */
public class SupperTest {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass {
    private int value;

    public void f() {
        value = 100;
        System.out.println("FatherClass value:" + value);
    }
}


class ChildClass extends FatherClass {
    private int value;

    public void f() {
        super.f();
        value = 200;
        System.out.println("ChildClass value:" + value);
    }
}
