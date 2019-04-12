package by.it.kozlov.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
class TaskC2 {
    public static int sumDigitsInNumber(int number) {
        int D4 = number / 1000;
        int D3 = number % 1000 / 100;
        int D2 = number % 100 / 10;
        int D1 = number % 10;
        int sum = D4 + D3 + D2 + D1;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int A = sumDigitsInNumber(number);
        System.out.println("\n" + A);
    }
}
//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }
