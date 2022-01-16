package lambda.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: fujing
 * @Date: 2022/1/15
 * @Description:
 * @Version: 1.0
 */
public class StreamApiExcise {
    class Student{
        private int id;
        private String name;
        private int age;
        public Student(int id,String name,int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        StreamApiExcise demo1 = new StreamApiExcise();
        List<Student> list = new ArrayList<>();
        list.add (demo1.new Student (1,"张三",18));
        list.add (demo1.new Student (2,"李四",20));
        list.add (demo1.new Student (3,"王二",22));
        list.add (demo1.new Student (4,"小明",19));
        list.add (demo1.new Student (5,"小红",17));
        list.add (null);
        //常用操作一：防空处理（过滤出非空数据）
        //Optional.ofNullable (list).orElse (Collections.emptyList ()).forEach (System.out::println);  会存在null
        list.stream ().filter (Objects::nonNull).forEach (student -> System.out.println (student));
        Map<Integer, Student> studentMap = list.stream().filter(student -> (student != null && student.age != 0)).collect(Collectors.toMap(Student::getId, student -> student));
        System.out.println("studentMap:"+studentMap);

        //常用操作二：集合变形  业务代码最为常见（假设我要取得某个集合中某个属性作为单独的一个集合）
        System.out.println ("=======================集合变形分割线===================");
        //集合转化流--->filter过滤--->map对集合做业务操作(返回的仍然是Stream<R>)--->流转化为集合
        List<String> nameList = list.stream ().filter (Objects::nonNull).map (Student::getName).collect(Collectors.toList());
        nameList.forEach (System.out::println);
        //limit 就像mysql的limit num 关键字  这里是查出前3条
        List<String> nameList2 = list.stream ().filter (Objects::nonNull).map (Student::getName).limit (3).collect(Collectors.toList());
        nameList2.forEach (s -> System.out.println ("limit" + s));
        //加上skip 类似于mysql分页 比如查看第1 到 10 条记录 select * from emp limit 0，9     这里也类似：这就是第2到第4条   也可以用于分页
        List<String> nameList3 = list.stream ().filter (Objects::nonNull).map (Student::getName).skip (1).limit (3).collect(Collectors.toList());
        nameList3.forEach (s -> System.out.println ("skip  limit" + s));
        List<Integer> list2 = Arrays.asList(1,2,3);
        //不改变原有元素
        list2.forEach(i -> i = i*2);
        list2.forEach(integer -> System.out.println ("不改变原有元素"+integer));
        //改变对象
        list2.stream().map(i -> i * 2).forEach(integer -> System.out.println ("改变原有元素"+integer));

        //常用操作三：list转map  {"id1":student1; "id2":student2}
        System.out.println ("=======================list转map分割线===================");
        Map<Integer,Student> map = list.stream ().filter (Objects::nonNull).collect (Collectors.toMap (student -> student.getId(), student -> student));
        for (Map.Entry<Integer, StreamApiExcise.Student> entrySet: map.entrySet ()){
            System.out.println (entrySet.getKey () +":"+ entrySet.getValue ());
        }
        //list转map 示例2  按ID重新分组，每组为一个list  {"id1":[student1]; "id2":[student2]}
        Map<Integer, List<Student>> collect = list.stream().collect(Collectors.groupingBy(student -> student.getId()));
//        Map<String, List<CollegeMajorEnum>> majorEnumMap = userService.getMajorEnum().stream().collect(Collectors.groupingBy(CollegeMajorEnum::getMajorCode));

        System.out.println ("=======================排序后分割线===================");
        //常用操作四：集合排序
        //方法1：利用Comparable 接口实现排序 String和Integer都是实现了此接口，需要覆写其
        List<Student> notNullList = list.stream ().filter (Objects::nonNull).collect (Collectors.toList ());
        Collections.sort (notNullList,(o1, o2) -> {
            return Integer.compare (o1.age,o2.age);
        });
        //利用Comparator 接口实现排序
        Collections.sort (notNullList,Comparator.comparing (o -> o.age));
        notNullList.forEach (student -> System.out.println (student));

        //当然觉得性能差 可以用并行方式输出，但结果不一定是顺序执行 1234...9
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream().forEach(System.out::println);
        numbers.parallelStream ().forEachOrdered (System.out::println);//顺序执行

        //list 转map
//        Map<String, List<CollegeMajorEnum>> majorEnumMap = userService.getMajorEnum().stream().collect(Collectors.groupingBy(CollegeMajorEnum::getMajorCode));
        //对list某个变量进行+1
//        List<HqQuestionnairePunch> collect = list.stream().map(hqQuestionnairePunch -> hqQuestionnairePunch.setPunchTimes(hqQuestionnairePunch.getPunchTimes() + 1)).collect(Collectors.toList());
        //对某个list对象取出某个属性
//        List<Integer> exists = list.stream().map(HqQuestionnairePunch::getUid).collect(Collectors.toList());


    }

}
