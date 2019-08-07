package by.epam.LinePrograms.task4;

import java.util.Scanner;

/*
* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа
* */

public class Main {
	
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num nnn.ddd");
        double num = scn.nextDouble();
        double Part2 = num % 1;
        double Part = num - Part2;
        double test = Part2 * 1000;
        long test2 =  Math.round(test);
        long test3 = Math.round(Part);
        
        System.out.println(test2);
        System.out.println(Part);

        long result = Integer.valueOf(String.valueOf(test2) + String.valueOf(test3));

        System.out.println(result  / 1000.0);

    }
}
