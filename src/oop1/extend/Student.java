package oop1.extend;

/**
 * @Author: fujing
 * @Date: 2022/3/3
 * @Description:
 * @Version: 1.0
 */
public class Student  extends Person{
    private  String No;

    private int score;

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
