package by.it.vstrigo.lesson04;

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
    public static void getNumDay(int mm, int dd) {
        int m = mm;
        int d = dd;
        switch (m) {
            case 1:
                System.out.println(d);
                break;
            case 2:
                System.out.println(31 + d);
                break;
            case 3:
                System.out.println(31 + 28 + d);
                break;
            case 4:
                System.out.println(31 + 28 + 31 + d);
                break;
            case 5:
                System.out.println(31 + 28 + 31 + 30 + d);
                break;
            case 6:
                System.out.println(31 + 28 + 31 + 30 + 31 + d);
                break;
            case 7:
                System.out.println(31 + 28 + 31 + 30 + 31 + 30 + d);
                break;
            case 8:
                System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + d);
                break;
            case 9:
                System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d);
                break;
            case 10:
                System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d);
                break;
            case 11:
                System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d);
                break;
            case 12:
                System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d);
                break;
        }
    }
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int day = scan.nextInt();
            int month = scan.nextInt();
            TaskC2.getNumDay(month, day);
        }
}
