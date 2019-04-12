package by.it.kozlov.lesson06;

public class DogHelper {

        public static void printAllNames(Dog[] dogs){
            for (int i = 0; i < dogs.length; i++) {
                System.out.print(dogs[i].name + " ");
            }
        }
        public static double averageAge(Dog[] dogs){
            int ag=0;
            for (int i = 0; i <dogs.length ; i++) {
                ag= dogs[i].age + ag;

            }
            double averageAge =(double)ag/(double)dogs.length;
            return averageAge;
        }
    }

