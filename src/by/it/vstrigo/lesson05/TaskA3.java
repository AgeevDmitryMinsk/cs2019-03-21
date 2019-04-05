package by.it.vstrigo.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0 9
*/

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        int min;
        int max;
        int size = array.length;
        for (int a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
        min = array[0];
        max = array[size - 1];
        System.out.println(min + " " + max);
    }
}
