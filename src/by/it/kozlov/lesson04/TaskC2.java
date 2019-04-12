package by.it.kozlov.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Ввод:");
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int m1=28;
        int m2=30;
        int m3=31;
        switch (m){
            case 1:
                System.out.println("Вывод"+"\n"+d);
                break;
            case 2:
                int d2= m3+d;
                System.out.println("Вывод"+"\n"+d2);
                break;
            case 3:
                int d3= m3+m1+d;
                System.out.println("Вывод"+"\n"+d3);
                break;
            case 4:
                int d4= (m3)*2+m1+d;
                System.out.println("Вывод"+"\n"+d4);
                break;
            case 5:
                int d5= (m3)*2+m2+m1+d;
                System.out.println("Вывод"+"\n"+d5);
                break;
            case 6:
                int d6= (m3)*3+m2+m1+d;
                System.out.println("Вывод"+"\n"+d6);
                break;
            case 7:
                int d7= (m3)*3+(m2)*2+m1+d;
                System.out.println("Вывод"+"\n"+d7);
                break;
            case 8:
                int d8= (m3)*4+(m2)*2+m1+d;
                System.out.println("Вывод"+"\n"+d8);
                break;
            case 9:
                int d9= (m3)*5+(m2)*2+m1+d;
                System.out.println("Вывод"+"\n"+d9);
                break;
            case 10:
                int d10= (m3)*5+(m2)*3+m1+d;
                System.out.println("Вывод"+"\n"+d10);
                break;
            case 11:
                int d11= (m3)*6+(m2)*3+m1+d;
                System.out.println("Вывод"+"\n"+d11);
                break;
            case 12:
                int d12= (m3)*6+(m2)*4+m1+d;
                System.out.println("Вывод"+"\n"+d12);
                break;

        }
    }
}
