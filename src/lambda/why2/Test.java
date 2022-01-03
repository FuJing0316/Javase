package lambda.why2;

import lambda.why2.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fujing
 * @Date: 2022/1/3
 * @Description:
 * @Version: 1.0
 */

/**
 * 为什么使用lambda?
 *
 * 案例： 查找出一个班级中，年龄大于等于15的学生 和 分数大于75分的学生。
 *
 * V2: 使用 策略模式 模式， 学生过滤功能 的重复代码，并且使得 功能的扩展性更好（如需要其他过类似滤规则，只需新增一个 filter即可）
 *
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan", 14, 67));
        list.add(new Student("lisi", 13, 89));
        list.add(new Student("wangwu", 15, 97));
        list.add(new Student("maliu", 12, 63));
        list.add(new Student("zhaoqi", 17, 75));

        //查找年龄大于等于15的学生
        findByStudentFilter(list, new AgeFilter());

        System.out.println("----------------------------------");

        //查找分数大于75分的学生
        findByStudentFilter(list, new SoreFilter());

    }

    private static void findByStudentFilter(ArrayList<Student> students, StudentFilter studentFilter) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (studentFilter.compare(student)) {
                list.add(student);
            }
        }

        printStudent(list);
    }


    private static void printStudent(List students) {
        for (Object student : students) {
            System.out.println(student);
        }
    }
}
