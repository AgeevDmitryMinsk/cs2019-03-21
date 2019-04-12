package by.it.kozlov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Arrays;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String[]> str= new ArrayList();
        String[] a ={"one massiv"};
        String [] b={"two massiv"};
        String [] c={"three massiv"};
        String [] d={"four massiv"};
        String [] e={"five massiv"};
        str.add(a);
        str.add(b);
        str.add(c);
        str.add(d);
        str.add(e);
        System.out.println(str.size());
        for (int i = 0; i <str.size(); i++) {
            System.out.print(Arrays.toString(str.get(i)) +"\n");
        } {


        }
    }
}
