package by.epam.Loops.task1;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float sum = 0;
        System.out.println("Введите положительное число");
        float num = scn.nextFloat();

        for (int i = 1; i < num; i++){

            sum += i;

            System.out.println(" " + i);

        }
        System.out.println("Summa " + sum);
    }

}
