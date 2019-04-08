package by.it.korzun.lesson06;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setAge(5);
        d1.setName("Шарик");

        Dog d2 = new Dog();
        d2.setAge(3);
        d2.setName("Тузик");

        System.out.println(d1.getName() + " " + d1.getAge());
        System.out.println();
    }
}