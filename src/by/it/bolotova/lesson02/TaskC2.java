package by.it.bolotova.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void  main(String[] args) {
        System.out.println("Введите 2 числа с клавиатуры");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int b = sc.nextInt();
        int x = i + b;
        System.out.println("DEC" + ":" + i + "+" + b + "=" + x);
     String a = Integer.toBinaryString(i);
     String c = Integer.toBinaryString(b);
     String w = Integer.toBinaryString(x);
     System.out.println("BIN" + ":" + a + "+" + c + "=" + w);
        a = Integer.toHexString(i);
        c = Integer.toHexString(b);
        w = Integer.toHexString(x);
       System.out.println("HEX" + ":" + a + "+" + c + "=" + w);
          a = Integer.toOctalString(i);
          c = Integer.toOctalString(b);
          w = Integer.toOctalString(x);
         System.out.println("OCT" + ":" + a + "+" + c + "=" + w);
    }

}
