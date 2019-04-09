package by.it.vstrigo.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC3 {
    static int mergeN =0;
    static int devideN =0;
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int[] array = sort(arr);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static int[] sort(int[] arr) {// сортировка MergeSort
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        devideN++;
        System.out.println("Вызов деления массива №" + devideN + " метка разделителя m = " + m);
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);
        int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        int[] left = sort(arr1);
        System.out.println("Передача первого (левого) аргумента методу слияния");
        int[] right = sort(arr2);
        System.out.println("Передача второго (правого) аргумента методу слияния");
        return merge(left, right);
    }

    public static int[] merge(int[] left, int [] right) {
        mergeN++;
        System.out.println("Вызов слияния массива №" + mergeN);
        int n = left.length + right.length;
        int[] buf = new int[n];
        int iL = 0;
        int iR = 0;
        for (int i = 0; i < n; i++) {
            if (iL == left.length) {
                buf[i] = right[iR];
                iR++;
                System.out.println("buf[" + i + "]=" + buf[i]);
            } else if (iR == right.length) {
                buf[i] = left[iL];
                iL++;
                System.out.println("buf[" + i + "]=" + buf[i]);
            } else {
                if (left[iL] > right[iR]) {
                    buf[i] = left[iL];
                    iL++;
                    System.out.println("buf[" + i + "]=" + buf[i]);
                } else {
                    buf[i] = right[iR];
                    iR++;
                    System.out.println("buf[" + i + "]=" + buf[i]);
                }
            }
        }
        return buf;
    }
}
