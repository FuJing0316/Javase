package lambda.why2;

import java.util.Comparator;

/**
 * @Author: fujing
 * @Date: 2022/1/3
 * @Description:
 * @Version: 1.0
 */
public interface StudentFilter {
    boolean compare(Student student);
}
