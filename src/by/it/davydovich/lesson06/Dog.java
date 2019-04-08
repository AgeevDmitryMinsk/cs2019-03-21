package by.it.davydovich.lesson06;

/**
 * Created by user on 08.04.2019.
 */
public class Dog {
    private int age;
    private String name;

    public Dog() {
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кличка:" + this.name + "Возвраст" + this.age;
    }
}

