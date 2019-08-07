package by.epam.Branching.task2;

import java.util.Scanner;

/*Найти max{min(a, b), min(c, d)}.*/

public class Main {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a");
        float a = scn.nextFloat();

        System.out.println("Enter b");
        float b = scn.nextFloat();

        System.out.println("Enter c");
        float c = scn.nextFloat();

        System.out.println("Enter d");
        float d = scn.nextFloat();

        float min_1 = 0;
        float min_2 = 0;
        float max = 0;

        min_1 = a > b ? b : a;
        min_2 = c > d ? d : c;
        max = min_1 > min_2 ? min_1 : min_2;

        System.out.println("max " + max);
    }
}
