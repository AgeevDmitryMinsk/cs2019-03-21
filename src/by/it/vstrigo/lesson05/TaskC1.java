package by.it.vstrigo.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    {   List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int str = sc.nextInt();
            list.add(str);
        }
        printList(getNewList1(list));
        printList(getNewList2(list));
        printList(getNewList3(list));
    }
    public static List<Integer> getNewList1(List<Integer> list0){
        List<Integer> list1 = new ArrayList<Integer>();
        for (int al : list0) {
            if (al % 3 == 0) list1.add(al);
            else continue;
        }
        return list1;
    }
    public static List<Integer> getNewList2(List<Integer> list0){
        List<Integer> list2 = new ArrayList<Integer>();
        for (int al : list0){
            if (al % 2 == 0) list2.add(al);
            else continue;
        }
        return list2;
    }
    public static List<Integer> getNewList3(List<Integer> list0){
        List<Integer> list3 = new ArrayList<Integer>();
        for (int al : list0){
            if ((al%3!=0)&&(al%2!=0)) list3.add(al);
            else continue;
        }
        return list3;
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
  }
}
