package by.it.davydovich.lesson06;

/**
 * Created by user on 08.04.2019.
 */
public class Dog {

    private int age;
    private String name;
    private int weight;
    private double power;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean win(Dog otherDog){
        double myChance = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double otherDogsChance = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return myChance > otherDogsChance;
    }

    @Override
    public String toString() {
        return "Кличка: " + this.name + ". Возраст: " + this.age;
    }
}

