package by.it.kozlov.lesson05;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]m=new int[10];
        int[]a=new int[10];
        int[]b = new int[10];
        for (int i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
            a[i]=m[i];
        }

          for (int i = 1; i < m.length; i++) {
              for (int j = m.length-1; j >=i ; j--) {
                if (m[j-1] > m[j]) {
                    int tr = m[j-1];
                    m[j-1] = m[j];
                    m[j] = tr;  }
                }
        }
        for (int i = 0; i <10 ; i++) {
            if (a[0]==m[i]){
                int q= i;
                System.out.println("Index of first element="+i);}
            if (a[9]==m[i]){
                int e=i;
                System.out.println("Index of last element="+i);
            }

        }
      // System.out.println(Arrays.toString(m));
       //   System.out.println(Arrays.toString(a));
    }
}
