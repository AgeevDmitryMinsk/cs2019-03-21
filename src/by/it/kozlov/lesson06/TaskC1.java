package by.it.kozlov.lesson06;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog Dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Dog s1= new Dog(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
        Dog s2= new Dog(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
        if (s1.win(s2)){
            System.out.println(s1.getName());        }
        else System.out.println(s2.getName());
    }
}
