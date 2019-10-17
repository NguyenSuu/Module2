package buildquadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The quadratic equation takes the form 'ax2+bx+c=0'");

        System.out.println("Enter a");
        double a = scanner.nextDouble();

        System.out.println("Enter b");
        double b = scanner.nextDouble();

        System.out.println("Enter c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.check();

    }
}
