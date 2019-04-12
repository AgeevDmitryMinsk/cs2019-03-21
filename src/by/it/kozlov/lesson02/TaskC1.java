package by.it.kozlov.lesson02;

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
        System.out.println("Ввод:");
        Scanner sn= new Scanner(System.in);
        int i= sn.nextInt();
        Scanner st= new Scanner(System.in);
        int j= sn.nextInt();
        int sum= i+j;
        System.out.println("Вывод:"+" "+"\nSum"+" "+"="+" "+sum);
    }
}
