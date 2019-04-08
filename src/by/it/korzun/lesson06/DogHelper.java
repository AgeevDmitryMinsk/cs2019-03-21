package by.it.korzun.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs){
            System.out.println(dog.getName()+" ");
        }
        System.out.println();
    }
    static double averageAge(Dog[]dogs){
        int sum=0;
        for (Dog dog: dogs){
            sum= sum+dog.getAge();
        }
    }
}
