package oop1;

/**
 * @Author: fujing
 * @Date: 2022/3/6
 * @Description:
 * @Version: 1.0
 */

/**
 * java方法调用，参数的值是否改变？
 *  方法中的参数列表叫形式参数，没有具体的值，只是为了方便在具体方法中使用
 *  调用方法的时候实际传入的值叫做实际参数，代表具体的数值，用来替换在方法体中代码逻辑的值进行运算
 *  注意：
 *      1、形式参数的变量名称也是局部变量
 *      2、当调用方法的参数是基本数据类型的时候，调用方法不糊改变原来的值
 *      3、如果方法的参数是引用类型，如果改变了引用类型的值，会改变原来对象的值
 *
 */
public class ArgumentTest {

    public static void test1(int a, int b) { //此处参数是形式参数
/*        int temp = a;
        a = b;
        b = temp;*/

        a = 1;
        b = 2;
    }


    //引用类型的变量：参数
    public static void test2(Point1 point1) {
        int x = point1.getX();
        int y = point1.getY();
        int temp = x;
        x = y;
        y = temp;

        point1.setX(x);
        point1.setY(y);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        test1(a,b);//调用方法的时候，这两是实际参数
        System.out.println(a);
        System.out.println(b);

        System.out.println("================");

        Point1 point1 = new Point1(5,8);
        test2(point1);
        System.out.println(point1.toString());
    }
}
