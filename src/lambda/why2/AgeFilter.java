package lambda.why2;

/**
 * @Author: fujing
 * @Date: 2022/1/3
 * @Description:
 * @Version: 1.0
 */
public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge() >= 15;
    }
}
