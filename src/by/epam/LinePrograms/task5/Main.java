package by.epam.LinePrograms.task5;

import java.util.Scanner;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

public class Main {
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int t = scn.nextInt();
        int hour = t / 3600;
        int min = t % 3600 / 60;
        int sec = t % 3600 % 60;

        System.out.println("Hour " + hour + " minutes " + min + " seconds " + sec);


    }
}
