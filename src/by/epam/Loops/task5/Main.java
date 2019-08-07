package by.epam.Loops.task5;

import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:*/

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the values of e = ");
        float e = scanner.nextFloat();
        System.out.print("Input the values of n = ");
        float n = scanner.nextFloat();
        float a;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            a = (float) (1 / pow(2, i) + 1 / pow(3, i));
            if (abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("sum = " + sum);
    }
}
