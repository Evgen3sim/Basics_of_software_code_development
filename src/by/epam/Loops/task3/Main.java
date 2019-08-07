package by.epam.Loops.task3;

/*Найти сумму квадратов первых ста чисел.*/

public class Main {
	
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 100; i++){
            sum = sum + Math.pow(i,2);
        }
        System.out.println("sum " + sum);
    }
}
