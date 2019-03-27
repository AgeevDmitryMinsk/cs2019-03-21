package by.it.vstrigo;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

 */
import java.util.Scanner;

class TaskC1{
    public static int getSum(int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
    public static void main(String []args){
        System.out.println("Введите два целочисленных числа, разделенные пробелом");
        Scanner sc = new Scanner(System.in);
        int[] numInt = new int[2];
        for (int i = 0; i<2; i++){
            if( (i==0) & (sc.hasNextInt())) {
                numInt[i] = sc.nextInt();
            } else if ( (i==1) & (sc.hasNextInt())) {
                numInt[i] = sc.nextInt();
            } else break;
        }
        int summaNum = getSum (numInt[0], numInt[1]);
        System.out.println("Sum = "+ summaNum);
    }
}

