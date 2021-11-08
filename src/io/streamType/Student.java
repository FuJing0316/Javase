package io.streamType;

import java.io.Serializable;

/**
 * @Author: fujing
 * @Date: 2021/11/7
 * @Description:
 * @Version: 1.0
 */
/**
 * 1、如果需要将对象通过io流进行传输，那么必须要实现序列化接口
 * 2、当前类中必须声明一个serialVersionUID的值，值为多少无所谓，但是要有
 * 3、transient:使用此关键字修饰的变量，在进行序列化的时候，不会别序列化
 *
 */
public class Student implements Serializable {

    //serialVersionUID:值是多少无所谓，只是为了标记，在使用IO进行对象传输，序列化反序列使用的是同一个对象；
    //如果不想某个属性被序列化，使用transient
    public long serialVersionUID = 1L;

    private String name;
    private int age;
    transient private String password;

    public Student(String name, int age,String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "serialVersionUID=" + serialVersionUID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
