package by.it.vstrigo.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/


import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int[]array1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<array1.length; i++)
            array1[i] = sc.nextInt();
        int[]array2 = new int[10];
        int j=0;
        for (int i=array1.length-1; i >= 0; i--) {
            int k = array1[i];
            array2[j] = k;
            j++;
        }
        for (int i=0; i<array2.length; i++)
            System.out.println(array2[i]);
    }
}
