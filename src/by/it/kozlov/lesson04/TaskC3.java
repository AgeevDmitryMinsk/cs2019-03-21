package by.it.kozlov.lesson04;

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

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
     int j;
     int i2=2;
     while (10>=i2){
         for (j=2;10>=j;j++){
            int a1=i2*j;
            int T1=a1/10;
            int T2=a1%10;

    if (T2==4&&i2==2) {System.out.println("два умножить на два равно четыре");}
    if (T2==6&&i2==2) { System.out.println("два умножить на три равно шесть");}
    if (T2==8&&i2==2) {System.out.println("два умножить на четыре равно восемь");}
    if (T2==6&&i2==3) {System.out.println("три умножить на два равно шесть");}
    if (T2==8&&i2==4) {System.out.println("четыре умножить на два равно восемь");}
    if (T2==9&&i2==3) {System.out.println("три умножить на три равно девять");}
if (a1==10 &&i2==2){ System.out.println("два умножить на пять равно десять");}
if (a1==10&& i2==5){System.out.println("пять умножить на два равно десять");}

if (T2==2&&i2==2) { System.out.println("два умножить на шесть равно двенадцать");}
if (T2==2&&i2==6) { System.out.println("шесть умножить на два равно двенадцать");}
if (T2==2&&i2==4) { System.out.println("четыре умножить на три равно двенадцать");}
if (T2==4&&i2==2) {System.out.println("два умножить на семь равно четырнадцать");}
if (T2==4&&i2==7) {System.out.println("семь умножить на два равно четырнадцать");}
if (T2==2&&i2==3) { System.out.println("три умножить на четыре равно двенадцать");}
if (T2==5&&i2==5) { System.out.println("пять умножить на три равно пятнадцать");}
if (T2==5&&i2==3) { System.out.println("три умножить на пять равно пятнадцать");}
if (T2==6&&i2==2) {  System.out.println("два умножить на восемь равно шестнадцать");}
if (T2==6&&i2==8) {  System.out.println("восемь умножить на два равно шестнадцать");}
if (T2==6&&i2==4) {  System.out.println("четыре умножить на четыре равно шестнадцать");}
if (T2==8&&i2==2) {System.out.println("два умножить на девять равно восемнадцать");}
if (T2==8&&i2==9) {System.out.println("девять умножить на два равно восемнадцать");}
if (T2==6&&i2==6) {System.out.println("шесть умножить на три равно восемнадцать");}
if (T2==8&&i2==3) {System.out.println("три умножить на шесть равно восемнадцать");}
if (a1==18&&i2==6) {System.out.println("шесть умножить на три равно восемнадцать");}
if (a1==20&&i2==2){System.out.println("два умножить на десять равно двадцать");}

if (T2==1&&i2==3) {System.out.println("три умножить на семь равно двадцать один");}
if (T2==1&&i2==7){ System.out.println("семь умножить на три равно двадцать один");}
if (T2==4&&i2==3){System.out.println("три умножить на восемь равно двадцать четыре");}
if (T2==4&&i2==4){ System.out.println("четыре умножить на шесть равно двадцать четыре");}
if (T2==4&&i2==6) {System.out.println("шесть умножить на четыре равно двадцать четыре");}
if (T2==4&&i2==8){ System.out.println("восемь умножить на три равно двадцать четыре");}
if (T2==5&&i2==5){ System.out.println("пять умножить на пять равно двадцать пять");}
if (T2==7&&i2==3){ System.out.println("три умножить на девять равно двадцать семь");}
if (T2==7&&i2==9){ System.out.println("девять умножить на три равно двадцать семь");}
if (T2==8&&i2==4){ System.out.println("четыре умножить на семь равно двадцать восемь");}
if (T2==8&&i2==7){ System.out.println("семь умножить на четыре равно двадцать восемь");}
if (a1==20&&i2==4){System.out.println("четыре умножить на пять равно двадцать");}
if (a1==20&&i2==5){System.out.println("пять умножить на четыре равно двадцать");}
if (a1==20&&i2==10){System.out.println("десять умножить на два равно двадцать");}

if (T2==2&&i2==3) {System.out.println("три умножить на десять равно тридцать два");}
if (T2==2&&i2==8) {System.out.println("восемь умножить на четыре равно тридцать два");}
if (T2==2&&i2==4){ System.out.println("четыре умножить на восемь равно тридцать два");}
if (T2==5&&i2==5){System.out.println("пять умножить на семь равно тридцать пять");}
if (T2==5&&i2==7){ System.out.println("семь умножить на пять равно тридцать пять");}
if (T2==6&&i2==4) {System.out.println("четыре умножить на девять равно тридцать шесть");}
if (T2==6&&i2==6){ System.out.println("шесть умножить на шесть равно тридцать шесть");}
if (T2==6&&i2==9){ System.out.println("девять умножить на четыре равно тридцать шесть");}

if (a1==30&&i2==3){ System.out.println("три умножить на десять равно тридцать");}
if (a1==30&&i2==5){ System.out.println("пять умножить на шесть равно тридцать");}
if (a1==30&&i2==6){ System.out.println("шесть умножить на пять равно тридцать");}
if (a1==30&&i2==10){ System.out.println("десять умножить на три равно тридцать");}

if (T2==2&&i2==6) {System.out.println("шесть умножить на семь равно сорок два");}
if (T2==2&&i2==7){ System.out.println("семь умножить на шесть равно сорок два");}
if (T2==5&&i2==5){System.out.println("пять умножить на девять равно сорок пять");}
if (T2==5&&i2==9){ System.out.println("девять умножить на пять равно сорок пять");}
if (T2==8&&i2==6) {System.out.println("шесть умножить на восемь равно сорок восемь");}
if (T2==8&&i2==8){ System.out.println("восемь умножить на шесть равно сорок восемь");}
if (T2==9&&i2==7){ System.out.println("семь умножить на семь равно сорок девять");}

if (a1==40&&i2==4){ System.out.println("четыре умножить на десять равно сорок");}
if (a1==40&&i2==5){ System.out.println("пять умножить на восемь равно сорок");}
if (a1==40&&i2==8){ System.out.println("восемь умножить на пять равно сорок");}
if (a1==40&&i2==10){ System.out.println("десять умножить на четыре равно сорок");}
if (T2==4&&i2==6) {System.out.println("шесть умножить на девять равно пятьдесят четыре");}
if (T2==4&&i2==9){ System.out.println("девять умножить на шесть равно пятьдесят четыре");}
if (T2==6&&i2==7){System.out.println("семь умножить на восемь равно пятьдесят шесть");}
if (T2==6&&i2==8){ System.out.println("восемь умножить на семь равно пятьдесят шесть");}

if (a1==50&&i2==5){ System.out.println("пять умножить на десять равно пятьдесят");}
if (a1==50&&i2==10){ System.out.println("десять умножить на пять равно пятьдесят");}
 if (T2==3&&i2==7) {System.out.println("семь умножить на девять равно шестьдесят три");}
 if (T2==3&&i2==9){ System.out.println("девять умножить на семь равно шестьдесят три");}
 if (T2==4&&i2==8){System.out.println("восемь умножить на восемь равно шестьдесят четыре");}
if (a1==60&&i2==6){ System.out.println("шесть умножить на десять равно шестьдесят");}
if (a1==70&&i2==7){ System.out.println("семь умножить на десять равно семьдесят");}
if (a1==70&&i2==10){ System.out.println("десять умножить на семь равно семьдесят");}
if (a1==72&&i2==8){ System.out.println("восемь умножить на девять равно семьдесят два");}
if (a1==72&&i2==9){ System.out.println("девять умножить на восемь равно семьдесят два");}
if (a1==60&&i2==10){ System.out.println("десять умножить на шесть равно шестьдесят");}
if (a1==80&&i2==8){ System.out.println("восемь умножить на десять равно восемьдесят");}
if (a1==80&&i2==10){ System.out.println("десять умножить на восемь равно восемьдесят");}
if (a1==81&&i2==9){System.out.println("девять умножить на девять равно восемьдесят один");}
if (a1==90&&i2==9){System.out.println("девять умножить на десять равно девяносто");}
if (a1==90&&i2==10){System.out.println("десять умножить на девять равно девяносто");}
if (a1==100){System.out.println("десять умножить на десять равно сто");}
                  }
         i2++; }
    }
}

