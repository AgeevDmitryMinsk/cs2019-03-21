package by.it.bolotova.lesson02.lesson02;

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
    public static void main(String[] args) {
        System.out.println("Введите вес человека в килограммах");
        Scanner sc = new Scanner(System.in);
        System.out.println(getWeight(sc.nextInt()));
            }
            public static double getWeight(int weight) {
        double e = 3.86;
        double m = 9.81;
        double x = e / m;
        double weightMars = weight * x;
        double w100 = weightMars * 100.0;
        int ww = (int) w100;
        if (w100 - ww < 0.5)
        return ww / 100.0;
        return (ww + 1) / 100.0;
             }

}

