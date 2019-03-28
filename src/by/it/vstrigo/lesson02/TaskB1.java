package by.it.vstrigo.lesson02;

/*
Выводим квадрат числа
Напишите программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.

Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Прочитать число можно так:
int i=sc.nextInt();

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать число типа Int с клавиатуры.
4. Программа должна выводить квадрат считанного числа.

 */

import java.util.Scanner;

class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число и по окончании нажмите Enter");
        Scanner scanner = new Scanner(System.in); // создание экземпляра обьекта класса Scsnner
        int integerVar = scanner.nextInt(); //считывание вводимого с клавиатуры числа типа int в переменную integerVar
        System.out.println((int)integerVar*integerVar); //вывод на консоль квадрата считанного числа
    }
}
