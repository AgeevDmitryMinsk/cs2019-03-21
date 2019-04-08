package by.it.vstrigo.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC3 {
    //используется сортировка массива методом слияния Merge Sort
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int[] array = sort(arr);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    //рекурсивная функция деления массива надвое, в которую вложенна функция слияния
    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;//условие прекращения рекурсии
        int m = arr.length / 2;//метка границы подмассивов
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);//левая часть массива, не включающая рассчитанную метку,
        // копируется в первый подмассив
        int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);//левая часть массива, включающая рассчитанную метку,
        // копируется во второй подмассив
        return merge(sort(arr1), sort(arr2));//рекурсивный вызов функции деления подмассивов с последующей
        // передачей полученных минимальных подмассивов в качестве аргументов методу слияния
    }
    //слияние двух массивов в один отсортированный
    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] buf = new int[n];
        int i1 = 0;//указатель наибольшего элемента в левой части массива
        int i2 = 0;//указатель наибольшего элемента в правой части массива
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {//если элементы в левой части массива закончились - левый указатель вышел за пределы
                // сортируемого участка
                buf[i] = arr2[i2];
                i2++;
            } else if (i2 == arr2.length) {//если элементы в правой части массива закончились - правый указатель вышел
                // за пределы сортируемого участка
                buf[i] = arr1[i1];
                i1++;
            } else {
                if (arr1[i1] > arr2[i2]) {
                    buf[i] = arr1[i1];
                    i1++;
                } else {
                    buf[i] = arr2[i2];
                    i2++;
                }
            }
        }
        return buf;
    }
}
