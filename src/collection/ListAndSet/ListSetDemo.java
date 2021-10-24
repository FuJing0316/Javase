package collection.ListAndSet;

import java.util.*;

/**
 * @Author: fujing
 * @Date: 2021/10/23
 * @Description: Collecton接口，两个子接口：
 *      List:元素有序（插入顺序）且可重复 。常用子类：ArrayList、LinkedList
 *      Set:元素无序且不重复。常用子类
 *
 * @Version: 1.0
 */
public class ListSetDemo {
    public static void main(String[] args) {
        //ArrayList 底层使用数组存储数据，有下标数据连续存储，查询访问效率高，
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(true);
        list1.add(new Person("zhangsan", 16));
        System.out.println(list1);

        //LinkedList 底层使用双向链表存储数据，无下标非连续存储，导致数据访问效率不高，但插入、删除元素效率高
        List list2 = new LinkedList();
        list2.add(1);
        list2.add("lisi");
        list2.add(false);
//        list2.remove(1);  //移除元素
        System.out.println(list2);

        System.out.println("=======set接口========");

        //基于hashMap,使用哈希算法，实现数据存储
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add("zhansan");
        System.out.println(set1);

        //基于红黑树，
        Set set2 = new TreeSet();
        set2.add(new Person("lisi",11));
        set2.add(new Person("wangwu",12));
        set2.add(new Person("zhangsan",9));
        set2.add(new Person("lining",15));
        set2.add(new Person("fj",13));
        set2.add(new Person("nana",5));
        System.out.println(set2);


    }


}
