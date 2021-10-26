package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: fujing
 * @Date: 2021/10/25
 * @Description:
 * @Version: 1.0
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5};

        //给list添加元素
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "abc", "yu", "lisi", "wangwu");
        System.out.println(stringList);


        //集合元素排序 ： 按元素的自然顺序排序（自然顺序？）
//        Collections.sort(stringList);
//        System.out.println(stringList);


        //集合元素排序： 自定义比较器（按升序规则排序）
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println("自定义比较器，对list排序："+ stringList);


        //二分查找元素
        int count = Collections.binarySearch(stringList, "lisi", new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println("二分查找结果：" + count );


    }
}
