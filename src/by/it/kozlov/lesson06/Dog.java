package by.it.kozlov.lesson06;

/**
 * Created by user on 08.04.2019.
 */
public class Dog {
    private int weight; //вес собаки
    private double power; //сила укуса собаки
    String name;
    int age;

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
public int getWeight(){return weight;}
public void setWeight (int weight){this.weight=weight;}
public double getPower(){return power;}
public void setPower(double power){this.power=power;}
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}

    public Dog (){ }
public Dog (String name,int age){
        this.name=name;
        this.age=age;
}
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
    boolean win(Dog otherDog){
        double thisshans= 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double othershans=0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return thisshans>othershans;
    }
    }


