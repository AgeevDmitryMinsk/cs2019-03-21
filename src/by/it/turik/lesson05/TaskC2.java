package by.it.turik.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        sort(array);
        for (int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }
    public static void sort(int[] array) {
        //Это метод сортировки вставками
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}