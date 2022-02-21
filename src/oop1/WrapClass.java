package oop1;

/**
 * @Author: fujing
 * @Date: 2022/2/21
 * @Description:
 * @Version: 1.0
 */

import java.awt.geom.RoundRectangle2D;

/**
 * 1、基本类型有：byte、short、char、int、long、boolean。对应包装类分别是：Byte、Short、Character、Integer、Long、Boolean。注意区分大小写。
 * 2、二者的区别是：基本类型在程序中就是一个普通变量，而包装类是类，体现在程序中是引用变量。
 * 3、基本类型存储在栈中，而包装类对象存储在堆中。
 * 4、以上这些包装类，都实现了常量池技术（final class）.String也是final的。
 */
public class WrapClass {

    public static void main(String[] args) {
        objPoolTest();
    }


    public static void objPoolTest() {
        int i = 40;
        int i0 = 40;
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);
        Double d1=1.0;
        Double d2=1.0;

        System.out.println("i=i0\t" + (i == i0));
        System.out.println("i1=i2\t" + (i1 == i2));
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));
        System.out.println("i4=i5\t" + (i4 == i5));
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));
        System.out.println("d1=d2\t" + (d1==d2));
        System.out.println();

    }

}
