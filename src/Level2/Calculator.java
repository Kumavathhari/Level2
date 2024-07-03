package Level2;

import java.util.Scanner;

public class Calculator {
    public static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        double num1 = getInput();
        double num2 = getInput();

        double result = add(num1, num2);

        System.out.println("The sum is: " + result);
    }
}
