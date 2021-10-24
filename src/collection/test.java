package collection;

/**
 * @Author: fujing
 * @Date: 2021/10/24
 * @Description:  Map.Entry<K,V>    map的内部接口Entry<K,V>
 * @Version: 1.0
 */
public interface test {
    int outMethod();

    interface subInter{
        default void method(){
            System.out.println("接口内部的接口");
        }

        String method2();
    }
}
