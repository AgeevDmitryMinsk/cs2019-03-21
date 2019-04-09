package by.it.bolotova.lesson02.lesson06;

public class DogHelper {
    static void printAllNames(Dog [] dogs) {
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " ");
        }
        System.out.println();
    }
}
