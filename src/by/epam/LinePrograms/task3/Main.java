package by.epam.LinePrograms.task3;

import java.util.Scanner;
import static java.lang.Math.cos;
import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.tan;

/*
* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
sin x + cos y
∗ tg xy
cos x − sin y
* */

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double result = 0;
        
        result = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
        System.out.println("result = " + result);
    }
}
