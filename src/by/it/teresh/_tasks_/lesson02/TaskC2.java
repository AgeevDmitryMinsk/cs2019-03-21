package by.it.teresh._tasks_.lesson02;

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
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        int b =scan.nextInt();
        int a;
        a=i+b;
        String bin = Integer.toBinaryString(i);
        String s = Integer.toBinaryString(b);
        String t = Integer.toBinaryString(a);
        String oct = Integer.toOctalString(i);
        String oc = Integer.toOctalString(b);
        String ot = Integer.toOctalString(a);
        String hex =Integer.toHexString(i);
        String he =Integer.toHexString(b);
        String hx =Integer.toHexString(a);
           System.out.println("DEC:"+i+"+"+b+"="+a);
        System.out.println("BIN:"+bin+"+"+s+"="+t);
        System.out.println("HEX:"+hex+"+"+he+"="+hx);
        System.out.println("OCT:"+oct+"+"+oc+"="+ot);



    }

}
