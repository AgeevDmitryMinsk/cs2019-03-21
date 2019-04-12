package by.it.vstrigo.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/


public class TaskC3 {
    public static String getPart(int nn) {
        String nw;
        int n1, n2;
        int n = nn;
        if ((n > 20) && ((n % 10) != 0)) {
            n2 = n % 10;
            n1 = n - n % 10;
            nw = getConcatWord(n1, n2);
        } else {
            n2 = 0;
            n1 = n;
            nw = getConcatWord(n1, n2);
        }
        return nw;
    }

    public static String getConcatWord(int nn1, int nn2){
        String w, w1, w2;
        int n1 = nn1;
        int n2 = nn2;
        int n;
        w1 = getWord(n1);
        w2 = getWord(n2);
        w =  w1.concat(w2);
        return w;
    }
    public static String getWord (int nn) {
        String nw = "";
        int n = nn;
        switch (n) {
            case 1:
                nw = " один";
                break;
            case 2:
                nw = " два";
                break;
            case 3:
                nw = " три";
                break;
            case 4:
                nw = " четыре";
                break;
            case 5:
                nw = " пять";
                break;
            case 6:
                nw = " шесть";
                break;
            case 7:
                nw = " семь";
                break;
            case 8:
                nw = " восемь";
                break;
            case 9:
                nw = " девять";
                break;
            case 10:
                nw = " десять";
                break;
            case 11:
                nw = " одиннадцать";
                break;
            case 12:
                nw = " двенадцать";
                break;
            case 13:
                nw = " тринадцать";
                break;
            case 14:
                nw = " четырнадцать";
                break;
            case 15:
                nw = " пятнадцать";
                break;
            case 16:
                nw = " шестнадцать";
                break;
            case 17:
                nw = " семнадцать";
                break;
            case 18:
                nw = " восемнадцать";
                break;
            case 19:
                nw = " девятнадцать";
                break;
            case 20:
                nw = " двадцать";
                break;
            case 30:
                nw = " тридцать";
                break;
            case 40:
                nw = " сорок";
                break;
            case 50:
                nw = " пятьдесят";
                break;
            case 60:
                nw = " шестьдесят";
                break;
            case 70:
                nw = " семьдесят";
                break;
            case 80:
                nw = " восемьдесят";
                break;
            case 90:
                nw = " девяносто";
                break;
            case 100:
                nw = " сто";
                break;
                default:
                    break;
        }
        return nw;
    }
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                int multiplyIJ = i * j;
                System.out.println(getPart(i) + " умножить на" + getPart(j) + " равно" + getPart(multiplyIJ));
            }
        }
    }
}
