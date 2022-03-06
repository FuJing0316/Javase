package oop1;

import oop2.Point;

/**
 * @Author: fujing
 * @Date: 2022/3/6
 * @Description:
 * @Version: 1.0
 */
public class Point1 {
    private int x;
    private int y;

    public Point1(){

    }

    public Point1(int a,int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
