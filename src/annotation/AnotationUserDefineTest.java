package annotation;

/**
 * @Author: fujing
 * @Date: 2022/1/16
 * @Description: 自定义一个注解
 * @Version: 1.0
 */

import java.lang.annotation.*;

/**
 * 自定义注解注意几个点：
 *      1-元注解的使用；
 *      2-注解的属性名称及默认值 的定义
 *      3-如果自定义注解没有属性名称，则Java默认的属性名称是 value
 */

//target用来声明当前自定义的注解适合适用于什么地方，类，方法，变量，包。。。。
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//retention用来表示当前注解适用于什么环境，是源码级别还是类级别还是运行时环境，一般都是运行时环境
@Retention(RetentionPolicy.CLASS)
//表示该注解是否是显示在javadoc中
@Documented
//表示当前注解是否能够被继承
@Inherited
@interface AnotationUserDefine {
   //注解属性名称的定义方式，看起来很像方法定义，但实际上是在使用注解时，填写的参数名称，默认值 是value
   String name() default "lisisi";

   //关于默认值：因为自定义注解中所有方法都需要在使用注解的时候，添加值(不加编译不过)，很麻烦，所以包含了默认值
   int age() default 12;

   int id() default 1;

   String[] likes() default {"a", "b", "c"};

}


//@AnotationUserDefine
@AnotationUserDefine(name = "", age = 8, id = 5, likes = {"book", "movie"})
public class AnotationUserDefineTest {
   public void test() {

   };

}