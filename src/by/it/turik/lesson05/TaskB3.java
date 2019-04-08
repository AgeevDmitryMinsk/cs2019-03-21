package by.it.turik.lesson05;

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
            int[] m = new int[10];
            int[] mSorted = new int[10];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                m[i] = scanner.nextInt();
                mSorted[i] = m[i];
            }

            for (int i = 0; i < 9; i++) {
                if (mSorted[i] > mSorted[i+1]) {
                    int g = mSorted[i];
                    mSorted[i] = mSorted[i+1];
                    mSorted[i+1] = g;
                }

                if (i == 8) {
                    boolean sorted = true;
                    for (int j = 0; j < 9; j++) {
                        if (mSorted[j] > mSorted[j+1]) {
                            sorted = false;
                            break;
                        }
                    }
                    if (sorted) {
                        break;
                    }

                    i = -1;
                }

            }

            for (int i = 0; i < 10; i++) {
                if (m[0] == mSorted[i]) {
                    System.out.println("Index of first element=" + i);
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (m[9] == mSorted[i]) {
                    System.out.println("Index of last element=" + i);
                    break;
                }
            }

        }

    }



