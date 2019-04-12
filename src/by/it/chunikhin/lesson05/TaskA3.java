package by.it.chunikhin.lesson05;

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
        int[] nums=new int[10];
        Scanner s=new Scanner(System.in);
for (int i=0; i< nums.length; i++ ){
    nums[i]=s.nextInt();
}
int min,max;
min=max=nums[0];
for (int i=1; i<nums.length; i++){
    if ((nums[i]) > max) max=nums[i];
    if ((nums[i]) < min) min=nums[i];
}
        System.out.println("Минимальное и максимальное числа:" + min + " " + max);
    }
}
