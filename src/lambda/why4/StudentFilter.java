package lambda.why4;

/**
 * @Author: fujing
 * @Date: 2022/1/3
 * @Description:
 * @Version: 1.0
 */

@FunctionalInterface
public interface StudentFilter {
    boolean compare(Student student);
}
