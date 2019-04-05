package by.it.vstrigo.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        //Создать исходный массив
        int[] array1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++)
            array1[i] = sc.nextInt();
        //Скопировать исходный массив в новый
        int[] array2 = new int[10];
        int j=0;
        for (int i=array1.length-1; i >= 0; i--) {
            int k = array1[i];
            array2[j] = k;
            j++;
        }
        //Отсортировать по возрастанию новый массив
        int min;
        int max;
        int size = array2.length;
        for (int a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (array2[b - 1] > array2[b]) {
                    int t = array2[b - 1];
                    array2[b - 1] = array2[b];
                    array2[b] = t;
                }
            }
        }
        min = array1[0];//Сохранить в переменную первый элемент исходного массива
        max = array1[size - 1];//Сохранить в переменную последний элемент исходного массива

        int b, c;
        int i1 = 0;
        int i2 = 0;
        for  (b=0; b < array2.length; b++) {
            if (array2[b] == min)
                i1 = b;
            else continue;
        }
        for  (c=0; c < array2.length; c++) {
            if (array2[c] == max)
                i2 = c;
            else continue;
        }

        System.out.println("Index of first element=" + i1);
        System.out.println("Index of last element=" + i2);
    }

}
