package lambda.why4;

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
 * V3: 基于V3，将使用的匿名内部类，替换成 lambda表达式
 *
 *  StudentFilter 在此例中，就是一个函数式接口（只有一个抽象方法）
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
/*        findByStudentFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getAge() >= 15;
            }
        });*/
        findByStudentFilter(list, (e) -> {
            return e.getAge() >= 15;
        });


        System.out.println("----------------------------------");

        //查找分数大于75分的学生
/*        findByStudentFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getScore() > 75;
            }
        });*/
        findByStudentFilter(list, e -> e.getScore() > 75);

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
