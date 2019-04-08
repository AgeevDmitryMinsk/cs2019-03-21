package by.it.turik.lesson02;

import javafx.util.converter.DefaultStringConverter;

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

class TaskC2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int c = a+b;
        System.out.println("DEC:"+ a +"+" + b+ "=" + c);


        String bin_sta = Integer.toBinaryString(a);
        String bin_stb = Integer.toBinaryString(b);
        String bin_stc = Integer.toBinaryString(c);
        System.out.println("BIN:"+ bin_sta + "+" + bin_stb +"=" + bin_stc);

        String hex_sta = Integer.toHexString(a);
        String hex_stb = Integer.toHexString(b);
        String hex_stc = Integer.toHexString(c);
        System.out.println("HEX:"+ hex_sta + "+" + hex_stb +"=" + hex_stc);

        String oct_sta = Integer.toOctalString(a);
        String oct_stb = Integer.toOctalString(b);
        String oct_stc = Integer.toOctalString(c);
        System.out.println("OCT:"+ oct_sta + "+" + oct_stb +"=" + oct_stc);



    }
}



