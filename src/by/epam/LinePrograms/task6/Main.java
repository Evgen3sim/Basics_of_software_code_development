package by.epam.LinePrograms.task6;

import java.util.Scanner;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

public class Main {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the coordinates of the point x, y");
        float x = scn.nextFloat();
        float y = scn.nextFloat();
        if ((x >= -4 && x <= 4) && (y >= -3)){
            if (y >= -3 && y <= 4)
            {
             if ((y >= -3 && y <= 4) && (x >= -4 && x <= 4)){
                 System.out.println("true");
             }else
             {
                 System.out.println("false");
             }
            } else{
                System.out.println("false");
            }
        } else
        {
            System.out.println("false");
        }

    }
}
