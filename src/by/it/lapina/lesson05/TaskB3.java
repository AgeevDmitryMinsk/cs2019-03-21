package by.it.lapina.lesson05;

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

import java.util.Arrays;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer [] m = new Integer[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = scn.nextInt();
        }
        int mfirst = m[0];
        int mlast = m[m.length-1];
        // сортировка пузырьком
        for(int i = m.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( m[j] > m[j+1] ){
                int tmp = m[j];
                m[j] = m[j+1];
                m[j+1] = tmp;
            }
            }
        }
        System.out.println(Arrays.toString(m));
        System.out.println("mfirst="+mfirst+" mlast="+mlast);
        System.out.println("Index of first element="+Arrays.asList(m).indexOf(mfirst));
        System.out.println("Index of last element="+Arrays.asList(m).indexOf(mlast));
    }
}
