package by.epam.Loops.task6;

import java.util.Scanner;

/* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		String terminate = "";
		int number;
		char character;
			System.out.println("Input code of symbol and symbol");
			number = scanner.nextInt();
			character = scanner.next().charAt(0);
			if (number == character) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
    }

