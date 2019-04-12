package by.it.lapina.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        int num1 = g.nextInt();
        int num2 = g.nextInt();
        int num3 = num1+num2;
        System.out.println("Sum = "+num3);
    }




}
