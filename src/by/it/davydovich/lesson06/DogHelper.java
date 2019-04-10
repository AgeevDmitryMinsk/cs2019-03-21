package by.it.davydovich.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() +" ");
        }
    }

    static double averageAge(Dog[] dogs) {
        double totalAge = 0;
        for (int i = 0; i < dogs.length; i++) {
            totalAge = totalAge + dogs[i].getAge();
        }
        return totalAge / (double) dogs.length;
    }
}
