package collection.Map;

import java.util.*;

/**
 * @Author: fujing
 * @Date: 2021/10/24
 * @Description:
 *      Map的两个子接口:
 *          hashHap : 数组+链表（1.7），数组+链表+红黑树（1.8）
 *          linkeHashMap:链表实现
 *          TreeMap:红黑树
 *
 *      //hashMap 和 hashTable区别：
 *          1、hashmap线程不安全，效率高，hashtable线程安全，效率低（单线程环境使用hashmap即可）
 *          2、hashmap允许有空值（null key,null value，只能有一对），hashtable不允许为空
 *
 *      // Map.Entry<String, Integer>  map内部的接口，维护了属于当前类的所有k-v集合
 *
 *
 * @Version: 1.0
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);
        map1.put(null, null);//hashmap k-v允许为null，但只允许一对null key
        map1.put(null, 8);
        System.out.println(map1);
//        map1.clear();
//        System.out.println(map1);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("44", 44);
        map3.put("55", 55);
        map1.putAll(map3);
        System.out.println(map1);

        map1.replace("55", 110);
        System.out.println("替换后：" + map1);
        System.out.println(map1.containsKey("55"));
        System.out.println(map1.containsValue(110));
        System.out.println(map1.isEmpty());//判断map是否为空（不包含键值对）

        // Map.Entry<String, Integer>  map内部的接口，维护了属于当前类的所有k-v集合
        //map.entrySet() 方法，返回此map所有键值对的集合
        System.out.println("======遍历map1========");
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();//返回此map键值对的集合
        //迭代器遍历
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.print("k:" + next.getKey());
//            System.out.print("\n");
            System.out.print(",v:" + next.getValue() + ";  ");
        }
        System.out.println("\n" + "========================");


        Set<String> strings = map1.keySet();
        System.out.println("key set:" + strings);

        Collection<Integer> values = map1.values();
        System.out.println("values:" + values);


/*        Map<String,Integer> map2 = new Hashtable<>();
        map2.put("a",1);
        map2.put("b", 2);
        map2.put("c", 3);
        map2.put("d", 4);
        map2.put(null,123);//hashtable 不允许有null key，否则会抛空指针异常
        map2.put(null,null);
        System.out.println(map2);*/

    }


}
