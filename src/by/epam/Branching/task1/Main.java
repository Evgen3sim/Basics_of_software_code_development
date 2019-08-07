package by.epam.Branching.task1;

import java.util.Scanner;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two angles in degrees");
        float angle_1 = scn.nextFloat();
        float angle_2 = scn.nextFloat();

        if (angle_1 + angle_2 < 180) {
            System.out.println("Exists");
            if (angle_1 + angle_2 == 90 || angle_1 == 90 || angle_2 == 90) {
                System.out.println("the triangle is rectangular.");
            } else {
                System.out.println("The triangle is not rectangular.");
            }
        } else {
            System.out.println("Does not exist");
        }



    }
}
