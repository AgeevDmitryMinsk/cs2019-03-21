package by.it.vstrigo.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static String monthWord (int m){
        int month = m;// месяц в числовом выражении
        String monthW ="";// месяц в текстовом представлении
        switch (month) {
            case 0:
                monthW = "месяц 0";
                break;
            case 1:
                monthW = "январь";
                break;
            case 2:
                monthW = "февраль";
                break;
            case 3:
                monthW = "март";
                break;
            case 4:
                monthW = "апрель";
                break;
            case 5:
                monthW = "май";
                break;
            case 6:
                monthW = "июнь";
                break;
            case 7:
                monthW = "июль";
                break;
            case 8:
                monthW = "август";
                break;
            case 9:
                monthW = "сентябрь";
                break;
            case 10:
                monthW = "октябрь";
                break;
            case 11:
                monthW = "ноябрь";
                break;
            case 12:
                monthW = "декабрь";
                break;
            case 13:
                monthW = "месяц 13";
                break;
            case 14:
                monthW = "месяц 14";
                break;
            default: break;
        }
        return monthW;
    }
    public static double earnWithPremium (int mm, int ee){
        int mon = mm; //месяц
        int eEarn = ee; //зп без премии
        double ePlusP = ee; //зп c премией
        if ((mon == 0)||(mon == 13)||(mon == 14)){
            ePlusP = 0.0;
        }
        else if ((mon >= 6)&&(mon <= 8)) {
            ePlusP = (double) eEarn;
        }
        else
            ePlusP = (double) (eEarn + (double)eEarn/2);
        return ePlusP;
        }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        int earn = scan.nextInt();
        if ((earn < 300)||(earn > 3000)){
            System.out.println("Мы вам перезвоним!");
        }
        else {
            for (int i = 0; i<=14; i++){
            System.out.print("За " + monthWord(i) + " начислено $" + earnWithPremium(i, earn)+"\n");
            if (earnWithPremium(i, earn)== 666.0) break;
            }
        }
    }
}
