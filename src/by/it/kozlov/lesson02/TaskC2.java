package by.it.kozlov.lesson02;

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
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sn= new Scanner(System.in);
        int i= sn.nextInt();
        Scanner st= new Scanner(System.in);
        int j= sn.nextInt();
        int sum= i+j;
        System.out.println("DEC:"+i+"+"+j+"="+sum);
        String B1= Integer.toBinaryString(i);
        String B2= Integer.toBinaryString(j);
        String SB= Integer.toBinaryString(i+j);
        System.out.println("BIN:"+B1+"+"+B2+"="+SB);
        String H1= Integer.toHexString(i);
        String H2= Integer.toHexString(j);
        String SH= Integer.toHexString(i+j);
        System.out.println("HEX:"+H1+"+"+H2+"="+SH);
        String O1= Integer.toOctalString(i);
        String O2= Integer.toOctalString(j);
        String SO= Integer.toOctalString(i+j);
        System.out.println("OCT:"+O1+"+"+O2+"="+SO);
    }
}
