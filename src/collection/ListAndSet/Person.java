package collection.ListAndSet;

/**
 * @Author: fujing
 * @Date: 2021/10/23
 * @Description:
 * @Version: 1.0
 */
public class Person implements Comparable<Person> {
    String name;
    int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age) return -1;
        if (this.age > o.age) return 1;
        return 0;
    }
}
