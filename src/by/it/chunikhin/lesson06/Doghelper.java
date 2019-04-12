package by.it.chunikhin.lesson06;

public class Doghelper {
     static void printAllNames(Dog1[] dogs){
        for (Dog1 dog:dogs){
            System.out.print(dog.getName()+ " ");
        }
        System.out.println();
    }
    static double averageAge(Dog1[] dogs) {
      double sum=0;
      for(Dog1 dog:dogs){
          sum=sum+dog.getAge();
      }
      return sum/dogs.length;
    }
}
