package oop2.abstracts;

/**
 * @Author: fujing
 * @Date: 2022/3/6
 * @Description:
 * @Version: 1.0
 */
public class AbstractTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("小黑");
        dog.setAge(3);
        System.out.println(dog.toString());
    }

}
