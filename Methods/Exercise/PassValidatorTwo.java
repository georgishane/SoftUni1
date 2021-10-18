package Methods.Exercise;

import java.util.Scanner;

public class PassValidatorTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isLengthValid = true;
        boolean isContentValid = true;
        boolean isDigitValid = true;
        if (!lengthValidator(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isLengthValid = false;
        }
        if (!contentValidator(password)) {
            System.out.println("Password must consist only of letters and digits");
            isContentValid = false;
        }
        if (!digitValidator(password)) {
            System.out.println("Password must have at least 2 digits");
            isDigitValid = false;
        }

        if (isLengthValid && isContentValid && isDigitValid) {
            System.out.println("Password is valid");
        }
    }

    private static boolean digitValidator(String password) {
        int digitCount = 0;
        for (int i = 0; i <= password.length() - 1; i++) {

            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                digitCount += 1;
            }
        }
        return digitCount >= 2;
    }

    static boolean contentValidator(String pass) {
        for (int index = 0; index <= pass.length() - 1; index++) {
            char currentSymbol = pass.charAt(index);
            if (!Character.isLetter(currentSymbol)){
                if (!Character.isDigit(currentSymbol)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean lengthValidator(String password) {
        return (password.length() >= 6 && password.length() <= 10);

    }
}

