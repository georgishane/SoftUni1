package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFact = calcFirstFactorial(firstNumber);
        long secondFact = calcSecondFactorial(secondNumber);
        double divideResult = 1.0 * firstFact / secondFact;
        System.out.printf("%.2f", divideResult);
    }

    private static long calcSecondFactorial(int secondNumber) {
        long factorial = 1;
        for (int i = 1; i <= secondNumber; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static long calcFirstFactorial(int firstNumber) {
        long factorial = 1;
        for (int i = 1; i <= firstNumber; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
