package by.it.bolotova.lesson02.lesson05;

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
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < array.length; j++) {
            array[j] = sc.nextInt();
        }
        int a, b, t;
        int size = 10;
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        int d = array[0];
            int n = array[9];
                System.out.println("Index of first element=" + d);
                System.out.println("Index of last element=" + n);

            }
    }

