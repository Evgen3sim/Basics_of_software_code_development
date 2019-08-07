package by.epam.Branching.task3;

import java.util.Scanner;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("x1,y1");
        float x1 = scn.nextFloat();
        float y1 = scn.nextFloat();

        System.out.println("x2,y2");
        float x2 = scn.nextFloat();
        float y2 = scn.nextFloat();

        System.out.println("x3,y3");
        float x3 = scn.nextFloat();
        float y3 = scn.nextFloat();

        double poly_perimetr, plochad; // а, б, с - стороны треугольника(образуем из трез точек треугольник)

       double a = Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2),2));
       double b = Math.sqrt(Math.pow(Math.abs(x2-x3), 2) + Math.pow(Math.abs(y2-y3),2));
       double c = Math.sqrt(Math.pow(Math.abs(x1-x3), 2) + Math.pow(Math.abs(y1-y3),2));

       poly_perimetr = (a + b + c) / 2;
       plochad = Math.sqrt(poly_perimetr*(poly_perimetr - a) * (poly_perimetr - b) * (poly_perimetr - c));
       if (plochad == 0){
           System.out.println("The points lie on one straight line");
       }else
       {
           System.out.println("НThe points do not lie on one straight line");
       }



    }
}
