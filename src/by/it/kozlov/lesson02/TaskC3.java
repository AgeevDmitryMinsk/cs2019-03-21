package by.it.kozlov.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/

class TaskC3 {
    static double getWeight (int weight){
        double wA= (weight/9.81*3.86)*100.0;
        double a= (int) wA;
        double c= wA-a;
        if (c>0.5){
            ++a;
        }

        double s=a/100.0;
        return s;
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner sc= new Scanner(System.in);
        int weight = sc.nextInt();
        double S= getWeight(weight);
        System.out.println("Вывод:"+"\n"+S);
    }
    }

 /*
    class getWeight {
    static void getWeight (int weight){
            double getWeight;
            System.out.println("Ввод:");
            Scanner sn = new Scanner(System.in);
            int a = sn.nextInt();
            getWeight = (int) a * 3.86 * 100.0 / 9.81;
            double v = getWeight / 100.0;
            System.out.println("Вывод\n" + v);
        }
    }
*/