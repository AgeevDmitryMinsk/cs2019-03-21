package by.it.vstrigo.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static double dis (int aa, int bb, int cc){
        int a = aa;
        int b = bb;
        int c = cc;
        double discr = (b*b -4*a*c);
        return discr;
    }
    public static double getX1 (double disdis, int aa, int bb, int cc) {
        double dis = disdis;
        int a = aa;
        int b = bb;
        int c = cc;
        double x1 = 0;
        if (dis > 0) {
            x1 = (((-b) + Math.sqrt(dis)) / (2 * a));
        }
         else if (dis == 0) {
            x1 = ((-b) + Math.sqrt(dis)) / (2 * a);
        } else {
            x1 = 0;
         }
        return x1;
    }
    public static double getX2 (double disdis, int aa, int bb, int cc) {
        double dis = disdis;
        int a = aa;
        int b = bb;
        int c = cc;
        double x2 = 0;
        if (dis > 0) {
            x2 = ((-b) - Math.sqrt(dis)) / (2 * a);
        } else {
            x2 = 0;
        }
        return x2;
    }
    public static void showX(double xx1, double xx2){
        double x1 = xx1;
        double x2 = xx2;
        if ((x1 != 0)&&(x2 != 0))System.out.println(x1 + " " + x2);
        else if ((x1 != 0)&&(x2 == 0))System.out.println(x1);
        else   System.out.println("Отрицательный дискриминант");
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double dis = TaskB2.dis(a, b, c);
        double x1 = TaskB2.getX1(dis, a, b, c);
        double x2 = TaskB2.getX2(dis, a, b, c);
        TaskB2.showX(x1,  x2);
    }
}
