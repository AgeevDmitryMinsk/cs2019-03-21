package by.it.lapina.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list.add(scn.next());
//        }
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list.size());
        for (String str1: list  ) {
            System.out.println(str1);
        }
    }
}
