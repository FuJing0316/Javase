package oop1.extend;

/**
 * @Author: fujing
 * @Date: 2022/3/3
 * @Description:
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());



        Teacher teacher = new Teacher();
        teacher.setName("teacher");
        teacher.setGrade("三年级");
        teacher.setAge(23);
        teacher.setAddr("南山小学");
        System.out.println(teacher.toString());
    }
}
