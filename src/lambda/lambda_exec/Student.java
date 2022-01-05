package lambda.lambda_exec;

/**
 * @Author: fujing
 * @Date: 2022/1/5
 * @Description:
 * @Version: 1.0
 */
public class Student {

    private String name;


    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
