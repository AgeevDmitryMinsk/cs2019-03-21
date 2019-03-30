package by.it.teresh._tasks_.lesson03;

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
public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(sumDigitsInNumber(a));


    }

    private static int sumDigitsInNumber(int i) {
        int b = i % 10;
        int c = (i / 10) % 10;
        int d = (i / 100) % 10;
        int q = (i / 1000) % 10;
        int w = (i / 10000) % 10;
        int z = (i / 100000) % 10;
        int r = (i / 1000000) % 10;
        int t = (i / 10000000) % 10;
        int y = (i / 100000000) % 10;
        int u = i /  1000000000;
        int f = b + c + d + q + w + z + r + t + y + u;
        return f;

    }


//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}