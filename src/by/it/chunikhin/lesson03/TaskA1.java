package by.it.chunikhin.lesson03;

/*
Lesson 03. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.
5. Программа должна выводить double сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = s.nextInt();
        System.out.println("Введите число b: ");
        int b = s.nextInt();
        int res = a + b;
        int res1 = a - b;
        int res2 = a * b;
        int res3 = a / b;
        int res4 = a % b;
        System.out.println(res + " " + res1 + " " + res2 + " " + res3 + " " + res4);

        double dres = a + b;
        double dres1 = a - b;
        double dres2 = a * b;
        double dres3 = (double) a / b;
        double dres4 = a % b;
        System.out.println(dres + " " + dres1 + " " + dres2 + " " + dres3 + " " + dres4);
        }
}