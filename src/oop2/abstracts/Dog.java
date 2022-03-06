package oop2.abstracts;

/**
 * @Author: fujing
 * @Date: 2022/3/6
 * @Description:
 * @Version: 1.0
 */
public class Dog extends Pet {

    @Override
    public void eat() {
        System.out.println("dog eating bone..");
    }


    @Override
    public String toString() {
        return "Dog{}";
    }
}
