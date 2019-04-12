package by.it.chunikhin.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = s.nextInt();
        System.out.println("Введите второе число: ");
        int b = s.nextInt();
        int result = a + b;
        System.out.println("Sum" + " " + "=" + " " + result);
    }




}
