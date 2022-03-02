package oop1.extend;

/**
 * @Author: fujing
 * @Date: 2022/2/27
 * @Description:
 * @Version: 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.eat(); //子类继承了父类的属性和方法，所以子类可以直接调用父类
        mammal.puru();//子类也可以不调用父类，而调用自己的方法
    }
}



class Animal{
    private String eye;

    private String age;


    public void eat(){
        System.out.println("动物吃东西！");
    }
}

class Mammal extends Animal{

    public void puru(){
        System.out.println("哺乳动物吃奶");
    }
}