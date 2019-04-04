package by.it.davydovich.lesson04;

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
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int dayOfYear = 0;
        for (int nMonth = 1; nMonth <= 12; nMonth++) {
            int monthLength = 0;
            switch (nMonth) {
                case 1: monthLength = 31; break;
                case 2: monthLength = 28; break;
                case 3: monthLength = 31; break;
                case 4: monthLength = 30; break;
                case 5: monthLength = 31; break;
                case 6: monthLength = 30; break;
                case 7: monthLength = 31; break;
                case 8: monthLength = 31; break;
                case 9: monthLength = 30; break;
                case 10: monthLength = 31; break;
                case 11: monthLength = 30; break;
                case 12: monthLength = 31; break;
            }
            if (nMonth < month){
                dayOfYear = dayOfYear + monthLength;
            }
            else {
                dayOfYear = dayOfYear + day;
                break;
            }
       }
        System.out.println("Вывод");
        System.out.println(dayOfYear);
    }

}
