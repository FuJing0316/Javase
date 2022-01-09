package lambda.function_ref;

/**
 * @Author: fujing
 * @Date: 2022/1/9
 * @Description:
 * @Version: 1.0
 */

import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  方法的引用： 是直接访问类或实例中已存在方法的一种方式（它是一种只引用但不执行的方式）。
 *   如果函数式接口，抽象方法的实现，恰好可以通过调用另一个已存在的方法 来实现，那么就有可能使用方法的引用。
 *
 *    分类：
 *      静态方法的引用
 *      实例方法的引用
 *      对象方法的引用（跟实例方法区别？？  不常用）
 *      构造方法的引用
 */
public class Construct_Method_Ref {
    public static void main(String[] args) {
//---------------------------构造方法的引用----------------------------
        Supplier<People> supplier = ()->new People();
        Supplier<People> supplier2 = People::new;

        //以下 lambda表达式写法和 构造函数方法引用的写法 效果等价
        Function<String,People> function = (str)->new People(str);
        System.out.println("function--" + function.apply("lili"));
        Function<String,People> function2 = People::new;    //构造函数的方法引用
        System.out.println("function2---" + function2.apply("lili"));

    }
}


class People{
    private String name;

    public People(){};

    public People(String name){
        System.out.println("people--" + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
