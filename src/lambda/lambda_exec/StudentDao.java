package lambda.lambda_exec;

/**
 * @Author: fujing
 * @Date: 2022/1/5
 * @Description:
 * @Version: 1.0
 */
@FunctionalInterface
public interface StudentDao {
    Student insertStudent(Student student);
}
