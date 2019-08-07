package by.epam.LinePrograms.task1;

import java.util.Scanner;

/*Найдите значениефункции:z=((a–3)*b/2)+c.*/

public class Main {
	
    public static  void main(String[] args){	
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int z = ((a - 3) * b / 2) + c;

        System.out.println("z = " + z);

    }
}
