package by.it.chunikhin.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] array=new int[20];
        Scanner s=new Scanner(System.in);
        for (int i=0; i<array.length; i++){
            array[i]=s.nextInt();
        }
        sort(array);
        for (int x:array){
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if (array[i]>array[j]){
                    int t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
    }

}
