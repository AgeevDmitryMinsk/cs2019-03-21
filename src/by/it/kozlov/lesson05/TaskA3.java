package by.it.kozlov.lesson05;

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
       int [] mas=new int[10];
        Scanner sc= new Scanner(System.in);
        int min = 0;
        int max=0;
        for (int i = 0; i <10 ; i++) {
            mas[i]=sc.nextInt();
            if (min>mas[i]){min=mas[i];}
            if (max<mas[i]){max=mas[i];}}
            System.out.println(min+" "+max);

    }}


