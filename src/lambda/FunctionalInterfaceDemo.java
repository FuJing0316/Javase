package lambda;

/**
 * @Author: fujing
 * @Date: 2022/1/2
 * @Description:
 * @Version: 1.0
 */

/**
 * @FunctionalInterface :被此注解注释的接口，一定是函数式接口（有且只能有一个抽象方法的接口，
 * 其他方法只能是default/static的，否则编译会报错）
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    public default int add(int a, int b) {
        return 0;
    }

    public int delete(String name);

//    public int update(String name);

}
