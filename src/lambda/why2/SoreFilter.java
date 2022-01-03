package lambda.why2;

/**
 * @Author: fujing
 * @Date: 2022/1/3
 * @Description:
 * @Version: 1.0
 */
public class SoreFilter implements StudentFilter{
    @Override
    public boolean compare(Student student) {
        return student.getScore() > 75;
    }
}
