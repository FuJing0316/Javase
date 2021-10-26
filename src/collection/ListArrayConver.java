package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: fujing
 * @Date: 2021/10/26
 * @Description:
 * @Version: 1.0
 */
public class ListArrayConver {
    public static void main(String[] args) {
        //数组转list
        int[] intArr = new int[]{45, 1, 89, 445, 32, 0, 78, 188, 14, 1};
//        List<int[]> intList = Arrays.asList(intArr);
//        System.out.println(intList.toString()); //[[I@1b6d3586]

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers); //[1, 2, 3, 4, 5]

        //数组元素排序
//        String s = Arrays.toString(intArr);
//        System.out.println(s);

        List<String> list = new ArrayList<>();
        list.add(" wo ");
        list.add(" shi ");
        list.add(" shei ");
        Object[] objects = list.toArray();//list转数组
        System.out.println("list转数组--》数组转字符串--输出：" + Arrays.toString(objects));


    }


}
