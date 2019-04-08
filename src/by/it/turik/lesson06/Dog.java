package by.it.turik.lesson06;

public class Dog
{
    private int age;
    private String name;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name,int age ) {
        this.age = age;
        this.name = name;
    }

    public Dog(int weight, double power) {
        this.weight = weight;
        this.power = power;
    }

    public Dog(int weight) {
        this.weight = weight;
    }

    public Dog(double power) {
        this.power = power;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setPower(double power){
        this.power = power;
    }

    public Dog(String name,int age,  int weight, double power) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString()
    {
        return "Кличка: "+name+". Возраст: " +age;
    }

    boolean win(Dog otherDog){
        double myChance = 0.2*age+0.3*weight+0.5*power;
        double otherChance = 0.2*otherDog.age+0.3*otherDog.weight+0.5*otherDog.power;
        return myChance>otherChance;
    }
}
