package oop1.two;

/**
 * @Author: fujing
 * @Date: 2022/2/21
 * @Description:
 * @Version: 1.0
 */
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(3);
        p1.setY(1);

        Point p2 = new Point();
        p2.setX(4);
        p2.setY(5);

        System.out.println("two point distance=="+calDistance(p1, p2));


    }

   static double calDistance(Point p1,Point p2){
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY())*(p1.getY() - p2.getY()));
    }


}
