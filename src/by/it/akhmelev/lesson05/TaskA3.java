package by.it.akhmelev.lesson05;

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
        int[] arr=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        int min=arr[0];
        int max=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) max=arr[i];
            if (min>arr[i]) min=arr[i];
        }

        System.out.println(min+" "+max);

    }

}
