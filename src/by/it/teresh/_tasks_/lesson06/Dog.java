package by.it.teresh._tasks_.lesson06;

public class Dog {
    private String name;
    private int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки

    public Dog(String name, int i, int age, double power) {

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

    public Dog() {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Кличка:"+name+" " +"Возраст:"+age;
    }
    boolean win(Dog otherdog){
        double myChance=0.2*age+0.3*weight+0.5*power;
        double otherChance=0.2*otherdog.age+0.3*otherdog.weight+0.5*otherdog.power;
        return myChance>otherChance;
    }
}
