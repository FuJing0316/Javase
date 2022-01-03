package lambda.why;

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
 * 案例： 查找出一个班级中，年龄大于12的学生 和 分数大于75分的学生。
 *
 * V1:不使用lambda，使用传统的集合遍历方式，逐个比较方式
 *  问题： 重复、冗余代码。。。。
 *
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
        findByAge(list);
        System.out.println("----------------------------------");
        //查找分数大于75分的学生
        findByScore(list);

    }

    private static void findByScore(ArrayList<Student> list) {
        List<Student> list1 = new ArrayList<Student>();
        for (Student student : list) {
            if (student.getScore() > 75) {
                list1.add(student);
            }
        }
        for (Student student : list1) {
            System.out.println(student);
        }
    }


    private static void findByAge(ArrayList<Student> list) {
        List<Student> list1 = new ArrayList<Student>();
        for (Student student : list) {
            if (student.getAge() >= 15) {
                list1.add(student);
            }
        }
        for (Student student : list1) {
            System.out.println(student);
        }
    }
}
