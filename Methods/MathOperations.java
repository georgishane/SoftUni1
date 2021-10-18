package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNumber = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "+":
                add(firstNumber, secondNumber);
                break;
            case "*":
                multiply(firstNumber, secondNumber);
                break;
            case "-":
                subtract(firstNumber, secondNumber);
                break;
            case "/":
                divide(firstNumber, secondNumber);
                break;
        }

    }

    private static void divide(int firstNumber, int secondNumber) {
        double result = 1.0 * firstNumber / secondNumber;
        System.out.println(new DecimalFormat("0.####").format(firstNumber / secondNumber));

    }

    private static void subtract(int firstNumber, int secondNumber) {

        System.out.println(firstNumber - secondNumber);

    }

    private static void multiply(int firstNumber, int secondNumber) {

        System.out.println(firstNumber * secondNumber);

    }

    public static void add(int firstNumber, int secondNumber) {

        System.out.println(firstNumber + secondNumber);
    }

}

