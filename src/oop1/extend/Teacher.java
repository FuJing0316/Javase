package oop1.extend;

/**
 * @Author: fujing
 * @Date: 2022/3/3
 * @Description:
 * @Version: 1.0
 */
public class Teacher extends Person {

    private String addr;

    private String grade;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
