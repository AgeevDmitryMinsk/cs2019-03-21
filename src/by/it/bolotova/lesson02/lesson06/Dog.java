package by.it.bolotova.lesson02.lesson06;

public class Dog {
    private int age;
    private String name;

    public Dog() {
    }

    public Dog( String name, int age) {
        this.name = name;
        this.age = age;
    }
    private int weight;
    private double power;

    public Dog(int weight, double power) {
        this.weight = weight;
        this.power = power;
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

    public Dog(int age, String name, int weight, double power) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Кличка: " + this.name + ". Возраст: " + this.age;
    }
    boolean win(Dog otherDog) {
        double myChance = 0.2 * this.age + 0.3 + this.weight + 0.5 + this.power;
        double othermyChance = 0.2 * otherDog.age + 0.3 + otherDog.weight + 0.5 + otherDog.power;
        return myChance > othermyChance;

    }
}
