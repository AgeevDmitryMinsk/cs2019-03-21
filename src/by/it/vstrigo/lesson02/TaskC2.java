package by.it.vstrigo.lesson02;

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
   public static int getSum(int n1, int n2){
       int sum = n1+n2;
       return sum;
    }
   public static void main(String []args){
       System.out.println("Введите два целочисленных числа, разделенные пробелом");
       Scanner sc = new Scanner(System.in);
       int[] numInt = new int[2];
       for (int i = 0; i<2; i++){
           if( (i==0) & (sc.hasNextInt())) {
               numInt[i] = sc.nextInt();
           } else if ( (i==1) & (sc.hasNextInt())) {
               numInt[i] = sc.nextInt();
           } else break;
       }
       int summaNum = getSum (numInt[0], numInt[1]);
       System.out.println("DEC:"+ numInt[0] + "+" + numInt[1] + "=" + summaNum);
       System.out.println("BIN:"+ Integer.toBinaryString(numInt[0]) + "+" +Integer.toBinaryString(numInt[1])+ "=" +
               Integer.toBinaryString(summaNum));
       System.out.println("HEX:"+ Integer.toHexString(numInt[0]) + "+" +Integer.toHexString(numInt[1])+ "=" +
               Integer.toHexString(summaNum));
       System.out.println("OCT:"+ Integer.toOctalString(numInt[0]) + "+" +Integer.toOctalString(numInt[1])+ "=" +
               Integer.toOctalString(summaNum));
    }
}
