package by.epam.LinePrograms.task2;

import java.util.Scanner;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
b + √b 2 + 4ac
− a 3 c + b −2
2a
*/

public class Main {
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scn.nextInt();
        System.out.println("Enter number b");
        int b = scn.nextInt();
        System.out.println("Enter number c");
        int c = scn.nextInt();
        double result;

        result = ((b +  Math.sqrt((Math.pow(b,2)) + 4 * a * c )) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Result = " + result);

    }
}
