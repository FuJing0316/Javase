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
 * 4、以上这些包装类，都实现了常量池技术（final class）.String 也实现了常量池技术。
 *
 * 5、注意Double 和 Float没有实现常量池技术。 测试见下例
 *
 *
 *
 * -------------------------------------------------------
 * https://blog.csdn.net/qq_29073921/article/details/88864359
 * 栈 有很重要的一个特性： 栈中的数据可以共享。
 *
 *
 *
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
        Double d1 = 1.0;
        Double d2 = 1.0;

        Float c1 = 0.01f;
        Float c2 = 0.01f;

        System.out.println("i=i0\t" + (i == i0));//i和i0均是普通类型(int)的变量，所以数据直接存储在栈中，而栈有一个很重要的特性：栈中的数据可以共享。当我们定义了int i = 40;，再定义int i0 = 40;这时候会自动检查栈中是否有40这个数据，如果有，i0会直接指向i的40，不会再添加一个新的40。
        System.out.println("i1=i2\t" + (i1 == i2));//i1和i2均是引用类型，在栈中存储的是指针（==比较的是 栈中引用地址）。由于Integer包装类实现了常量池技术，因此i1、i2的40均是从常量池中获取的，均指向同一个地址，因此i1=12。
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));//很明显这是一个加法运算，Java的数学运算都是在栈中进行的，Java会自动对i1、i2进行拆箱操作转化成整型，因此i1在数值上等于i2+i3。
        System.out.println("i4=i5\t" + (i4 == i5));//i4和i5均是引用类型，在栈中存储指针，因为Integer是包装类。但是由于他们各自都是new出来的，因此不再从常量池寻找数据，而是从堆中各自new一个对象，然后各自保存指向对象的指针，所以i4和i5不相等，因为他们所存指针不同，所指向对象不同。
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));//这也是一个加法运算，和3同理。
        System.out.println("d1=d2\t" + (d1==d2));//d1和d2均是引用类型，在栈中存储指针，因为Double是包装类。但Double包装类没有实现常量池技术，因此Doubled1=1.0;相当于Double d1=new Double(1.0);是从堆new一个对象，d2同理。因此d1和d2存放的指针不同，指向的对象不同，所以不相等。
        System.out.println("c1=c2\t" + (c1==c2));//同Double。浮点型包装类微实现常量池技术，Float c1 = 0.01F 等价于 Float c1 = new Float（0.01）;引用指向堆中的地址，不相等。

    }

}
