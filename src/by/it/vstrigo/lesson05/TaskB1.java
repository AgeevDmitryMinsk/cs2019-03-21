package by.it.vstrigo.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        showSize(list);
        showList(list);
    }

    public static void showSize(ArrayList <String> list) {
        int sizeArr = list.size();
        System.out.println(sizeArr);
    }

    public static void showList(ArrayList<String> list) {
        for (int i = 0; i < 5; i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
